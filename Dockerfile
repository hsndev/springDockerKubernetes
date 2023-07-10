FROM khipu/openjdk17-alpine
COPY target/*.jar backend.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "backend.jar"]