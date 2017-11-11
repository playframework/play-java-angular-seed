import scala.sys.process.Process

/*
 * UI Build Scripts
 */
val Success = 0 // 0 exit code
val Error = 1 // 1 exit code

PlayKeys.playRunHooks += baseDirectory.map(AngularBuild.apply).value

val isWindows = System.getProperty("os.name").toLowerCase().contains("win")

def runScript(script: String)(implicit dir: File): Int = {
  if(isWindows){ Process("cmd /c " + script, dir) } else { Process(script, dir) } }!

def uiWasInstalled(implicit dir: File): Boolean = (dir / "node_modules").exists()

def runNpmInstall(implicit dir: File): Int =
  if (uiWasInstalled) Success else runScript("npm install")

def ifUiInstalled(task: => Int)(implicit dir: File): Int =
  if (runNpmInstall == Success) task
  else Error

// Include UI production build task here.
def runProdBuild(implicit dir: File): Int = ifUiInstalled(runScript("npm run build-prod"))

// Include UI development build task here.
def runDevBuild(implicit dir: File): Int = ifUiInstalled(runScript("npm run build-dev"))

// Include UI test build task here.
def runUiTests(implicit dir: File): Int = ifUiInstalled(runScript("npm run test-no-watch"))

lazy val `ui-dev-build` = TaskKey[Unit]("Run UI build when developing the application.")

`ui-dev-build` := {
  implicit val userInterfaceRoot = baseDirectory.value / "ui"
  if (runDevBuild != Success) throw new Exception("Oops! UI Build crashed.")
}

lazy val `ui-prod-build` = TaskKey[Unit]("Run UI build when packaging the application.")

`ui-prod-build` := {
  implicit val userInterfaceRoot = baseDirectory.value / "ui"
  if (runProdBuild != Success) throw new Exception("Oops! UI Build crashed.")
}

lazy val `ui-test` = TaskKey[Unit]("Run UI tests when testing application.")

`ui-test` := {
  implicit val userInterfaceRoot = baseDirectory.value / "ui"
  if (runUiTests != Success) throw new Exception("UI tests failed!")
}

`ui-test` := (`ui-test` dependsOn `ui-dev-build`).value

dist := (dist dependsOn `ui-prod-build`).value

stage := (stage dependsOn `ui-prod-build`).value

test := ((test in Test) dependsOn `ui-test`).value