# Hello Ktor
A Ktor starter project implementing hello service.

#### Run Tests
```shell script
$ ./batect test
```

#### Build Service
```shell script
$ ./batect build-service
```

#### Run Service
```shell script
$ ./batect run
```

#### Build Dockerised Service Image
```shell script
$ SERVER_NAME=BLUE SERVER_VERSION=1.0 ./batect build-image
```

#### Run Dockerised Service
```shell script
$ docker run -p 8080:8080 hello:1.0
```

#### Send Traffic to Service
```shell script
$ curl http://localhost:8080/hello
Hello, I am BLUE stack, version 1.0!
```