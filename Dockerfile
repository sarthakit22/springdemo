FROM openjdk:17
WORKDIR /app
COPY target/*.jar devops-integration.jar
ENTRYPOINT ["java", "-jar", "devops-integration.jar"]
