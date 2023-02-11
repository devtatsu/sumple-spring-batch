## spring initializr

- url:https://start.spring.io/
- dependencies
 - lombok
 - spring batch
 - spring data jdbc
 - H2 Database 

## 環境構築

### JDK

- version:11.0.7
- download:https://www.oracle.com/jp/java/technologies/javase/jdk11-archive-downloads.html
- env
 - name:JAVA_HOME
 - value:install home

### gradle

- version:Gradle 7.1
- download:https://services.gradle.org/distributions/gradle-7.1.1-bin.zip
- env
 - name:GRALE_HOME
 - value:install home

### vsCode

- Debugger for Java
- Extension Pack for Java
- Gradle for Java
- Language Support for Java
- Lombok Annotations Support
- Project Manager for Java
- Spring Boot Dashboard
- Spring Boot Extension Pack
- Spring Boot Tools
- Spring Initializr Java Support
- Test Runner fro Java

## build

`gradle build`
`gradle clean build`

## 実行コマンド

### myFooJobを実行

- cmd
`java -jar build\libs\demo-0.0.1-SNAPSHOT.jar --spring.batch.job.names=myFooJob --logging.level.root=ERROR`

- powershell
`java -jar build/libs/demo-0.0.1-SNAPSHOT.jar --spring.batch.job.names=myFooJob --logging.level.root=ERROR`

### myBarJobを実行

- cmd
`java -jar build\libs\demo-0.0.1-SNAPSHOT.jar --spring.batch.job.names=myBarJob --logging.level.root=ERROR`

- powershell
`java -jar build/libs/demo-0.0.1-SNAPSHOT.jar --spring.batch.job.names=myBarJob --logging.level.root=ERROR`

### 全てのJobを実行

-cmd
`java -jar build\libs\demo-0.0.1-SNAPSHOT.jar --logging.level.root=ERROR`

- powershell
`java -jar build/libs/demo-0.0.1-SNAPSHOT.jar --logging.level.root=ERROR`
