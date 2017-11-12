[<img src="https://img.shields.io/travis/playframework/play-java-starter-example.svg"/>](https://travis-ci.org/playframework/play-java-starter-example)

# :copyright: java-play-angular-seed

Java Play 2.6.x + Angular 5 with Angular CLI seed project with full-fledged build process

## :sparkles: Running

Run this using [sbt](http://www.scala-sbt.org/).

```
sbt run
```

And then go to http://localhost:4200 to see the running web application.

## :sparkles: Complete Directory Layout

```
├── /app/                       # The backend(java) application sources(controllers, models, views, assets)
├── /conf/                      # Configurations files and other non-compiled resources (on classpath)
│     ├── application.conf      # Builds the project from source to output(lib and bower) folder
│     ├── logback.xml           # Logging configuration
│     └── routes                # Routes definition
├── /logs/                      # Logs folder
│     └── application.log       # Default log file
├── /project/                   # Sbt configuration files
│     ├── AngularBuild          # PlayRunHook file to trigger angular serve with sbt run
│     ├── build.properties      # Marker for sbt project 
│     └── plugins.sbt           # Sbt plugins declaration
├── /public/                    # Public assets
│     └── /ui/                  # Frontend build assests
├── /sbt-dist/                  # 
│     ├── bin                   # 
│     └── conf                  # 
├── /target/                    # Generated stuff
│     ├── /universal/           # Application packaging
│     └── /web/                 # Compiled web assets
├── /ui/                        # Angular front end sources
├── .gitignore                  # Contains files to be ignored when pushing to git
├── build.sbt                   # Play application build script
├── LICENSE                     # Contains License Agreement file
├── README.md                   # Contains all user guide details for the application
├── sbt                         # 
├── sbt.bat                     # SBT launcher script
└── ui-build.sbt                # UI build scripts
```

## :sparkles: Controllers

There are several demonstration files available in this template.

- HomeController.java:

  Shows how to handle simple HTTP requests.

## :sparkles: Components

- Module.java:

  Shows how to use Guice to bind all the components needed by your application.

