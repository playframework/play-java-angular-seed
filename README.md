[![Build Status][build-badge]][build]
[![MIT License][license-badge]][LICENSE]

# :copyright: java-play-angular-seed

> java-play-angular-seed project illustrates how Play Framework can be used to develop backend/services along with Angular to develop the front-end/ui. 

> This is a totally integrated Java Play 2.6.x + Angular 5 with Angular CLI seed project with full-fledged build process.

## Used Versions

* Play Framework: 2.6.7
* Angular: 5.0.0
* Angular CLI: 1.5.0

## How to use it? 

### Prerequisites

* This assumes that you have [npm](https://npmjs.org/) installed.

### Let's get started,

* Run this using [sbt](http://www.scala-sbt.org/).

``` 
sbt run
```

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
│     ├── AngularBuild.scala    # PlayRunHook file to trigger angular serve with sbt run
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
│     ├── .angular-cli.json     # Builds the project from source to output(lib and bower) folder
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
└── ui-build.sbt                # UI build scripts
```

## What is new in here?

### AngularBuild.scala

* Represents PlayRunHook scala implementation to trigger angular serve with sbt run command.

```
    ├── /project/                   
    │     ├── AngularBuild.scala    
```

### ui-build.sbt

* `ui-build.sbt` file to represent UI builds scrips implementations to run along with the available sbt commands in the root level of teh project.

### npm run commands

* Added several new npm run commands in order to work smoothly with the sbt commands.
* Available front end build commands can be seen via [UI README.md](./ui/README.md).

```
├── /ui/                       
│     ├── package.json          
```

## Controllers

There are several demonstration files available in this template.

- HomeController.java:

  Shows how to handle simple HTTP requests.

## Components

- Module.java:

  Shows how to use Guice to bind all the components needed by your application.

## Contributors

<!-- ALL-CONTRIBUTORS-LIST:START - Do not remove or modify this section -->
|[<img src="https://avatars2.githubusercontent.com/u/5279079?s=400&v=4" width="100px;"/><br /><sub>Yohan Gomez</sub>][yohan-profile]| [<img src="https://avatars2.githubusercontent.com/u/6312524?s=400&u=efc9267c6f903c379fafaaf7b3b0d9a939474c01&v=4" width="100px;"/><br /><sub>Lahiru Jayamanna</sub>][lahiru-profile]<br />| [<img src="https://avatars0.githubusercontent.com/u/3881403?s=400&v=4" width="100px;"/><br /><sub>Gayan Attygalla</sub>](https://github.com/Arty26)| [<img src="https://avatars0.githubusercontent.com/u/24251976?s=400&v=4" width="100px;"/><br /><sub>Anuradha Gunasekara</sub>][anuradha-profile]|
| :---: | :---: | :---: | :---: |
<!-- ALL-CONTRIBUTORS-LIST:END -->

## License

This software is licensed under the MIT license

[build-badge]: https://travis-ci.org/yohangz/java-play-angular-seed.svg
[build]: https://travis-ci.org/yohangz/java-play-angular-seed
[license-badge]: http://img.shields.io/badge/license-MIT-blue.svg?style=flat
[license]: https://github.com/yohangz/java-play-angular-seed/blob/master/LICENSE

[yohan-profile]: https://github.com/yohangz
[lahiru-profile]: https://github.com/lahiruz
[gayan-profile]: https://github.com/Arty26
[anuradha-profile]: https://github.com/sanuradhag