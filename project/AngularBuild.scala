import java.net.InetSocketAddress

import play.sbt.PlayRunHook
import sbt._

import scala.sys.process.Process

object AngularBuild {
  def apply(base: File): PlayRunHook = {
    object UIBuildHook extends PlayRunHook {

      var process: Option[Process] = None

      var npmInstall: String = "npm install"
      var npmRun: String = "npm run start"

      // Windows requires npm commands prefixed with cmd /c
      if (System.getProperty("os.name").toLowerCase().contains("win")){
        npmInstall = "cmd /c" + npmInstall
        npmRun = "cmd /c" + npmRun
      }

      override def beforeStarted(): Unit = {
        if (!(base / "ui" / "node_modules").exists()) Process(npmInstall, base / "ui").!
      }

      override def afterStarted(addr: InetSocketAddress): Unit = {
        process = Option(
          Process(npmRun, base / "ui").run
        )
      }

      override def afterStopped(): Unit = {
        process.foreach(_.destroy())
        process = None
      }

    }

    UIBuildHook
  }
}
