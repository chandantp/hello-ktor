FROM zenika/kotlin:1.3-alpine

ARG server_name
ENV SERVER_NAME=$server_name

RUN mkdir -p /app
COPY build/libs/hello-ktor-1.0-SNAPSHOT.jar /app/hello.jar

RUN adduser guest -d /var/tmp -s /sbin/nologin
USER guest

CMD ["java -jar /app/hello.jar"]

EXPOSE 8080