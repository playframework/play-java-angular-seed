[<img src="https://img.shields.io/travis/playframework/play-java-starter-example.svg"/>](https://travis-ci.org/playframework/play-java-starter-example)

# :copyright: java-play-angular-seed

> java-play-angular-seed project illustrates how Play Framework can be used to develop backend/services along with AngularJs to develop the front-end/ui. This is a totally integrated Java Play 2.6.x + Angular 5 with Angular CLI seed project with full-fledged build process.

## Used Versions

* Play Framework: 2.6.7
* Angular: 5.0.0
* Angular CLI: 1.5.0

## Running

Run this using [sbt](http://www.scala-sbt.org/).

```
sbt run
```

Frontend build steps: [UI README.md](./ui/README.md)

## Complete Directory Layout

```
├── /app/                       # The backend (java) application sources (controllers, models, views, assets)
├── /conf/                      # Configurations files and other non-compiled resources (on classpath)
│     ├── application.conf      # Builds the project from source to output(lib and bower) folder
│     ├── logback.xml           # Logging configuration
│     └── routes                # Routes definition
├── /logs/                      # Logs folder
│     └── application.log       # Default log file
├── /project/                   # Sbt configuration files
│     ├── **AngularBuild**      # PlayRunHook file to trigger angular serve with sbt run
│     ├── build.properties      # Marker for sbt project 
│     └── plugins.sbt           # Sbt plugins declaration
├── /public/                    # Public assets
│     └── /ui/                  # Frontend build assests
├── /target/                    # Generated stuff
│     ├── /universal/           # Application packaging
│     └── /web/                 # Compiled web assets
├── /ui/                        # Angular front end sources
│     ├── /e2e/                 # End to end tests folder
│     ├── /node_modules/        # 3rd-party frontend libraries and utilities
│     ├── /src/                 # The frontend source code (modules, componensts, models, directives, services etc.) of the application
│     ├── angular-cli.json      # Builds the project from source to output(lib and bower) folder
│     ├── .editorconfig         # Define and maintain consistent coding styles between different editors and IDEs
│     ├── .gitignore            # Contains ui files to be ignored when pushing to git
│     ├── karma.conf.js         # Karma configuration file
│     ├── package.json          # Holds various metadata configuration relevant to the ui
│     ├── protractor.conf.js    # Protractor configuration file
│     ├── proxy.conf.json       # UI proxy configuration
│     ├── README.md             # Contains all user guide details for the ui
│     ├── tsconfig.json         # Contains typescript compiler options
│     └── tslint.json           # Lint rules for the ui
├── .gitignore                  # Contains files to be ignored when pushing to git
├── build.sbt                   # Play application build script
├── LICENSE                     # Contains License Agreement file
├── README.md                   # Contains all user guide details for the application
└── **ui-build.sbt**            # UI build scripts
```

## Controllers

There are several demonstration files available in this template.

- HomeController.java:

  Shows how to handle simple HTTP requests.

## Components

- Module.java:

  Shows how to use Guice to bind all the components needed by your application.

## License

This software is licensed under the MIT license