#FROM khipu/openjdk17-alpine
FROM openjdk:17-jdk-slim-buster
COPY target/*.jar backend.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "backend.jar"]