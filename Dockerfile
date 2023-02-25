FROM adoptopenjdk/openjdk17:alpine-jre
EXPOSE 8080
ADD target/devops-integration.jar devops-integration.jar
ENTRYPOINT ["jav","jar","/devops-integration.jar"]













