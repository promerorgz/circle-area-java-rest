# FROM maven:3.9.9 AS builder
# RUN mvn install


FROM amazoncorretto:21-alpine-jdk AS deplot
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]