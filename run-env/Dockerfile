FROM zenika/kotlin:1.3-alpine

ARG server_name
ARG server_version

ENV SERVER_NAME=$server_name
ENV SERVER_VERSION=$server_version

RUN mkdir -p /app
COPY ./hello-ktor-1.0-SNAPSHOT.jar /app/hello.jar

CMD ["java", "-jar", "/app/hello.jar"]

EXPOSE 8080