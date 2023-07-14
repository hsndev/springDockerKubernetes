#FROM khipu/openjdk17-alpine
#FROM openjdk:17-jdk-slim-buster
#COPY target/*.jar backend.jar
#EXPOSE 8080
#ENTRYPOINT ["java", "-jar", "backend.jar"]
FROM openjdk:17-jdk-slim-buster
LABEL maintainer="shanem@liatrio.com"
COPY /target/dockerBackend-0.0.1.jar docker-backend-1.jar
CMD ["java","-jar","docker-backend-1.jar"]