# Hello Ktor
A Ktor starter project implementing hello service.

This code has been built and tested on `JDK 1.8.0_181`.

#### Start hello-service using Gradle
```shell script
$ ./gradlew run
```

#### Start hello-service using Jar
```shell script
$ ./gradlew clean build    ### First build the jar
```

```shell script
$ java -jar build/libs/hello-ktor-1.0-SNAPSHOT.jar
```

#### Run Tests
```shell script
$ ./gradlew test
```