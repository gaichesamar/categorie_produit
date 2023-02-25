from openjdk:17
EXPOSE 8080
ADD target/devops-integration.jar devops-integration.jar
ENTRYPOINT ["jav","jar","/devops-integration.jar"]













