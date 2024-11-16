FROM eclipse-temurin:17
COPY target/automationdeployment.jar automationdeployment.jar
CMD [ "java", "-jar", "automationdeployment.jar" ]