FROM adoptopenjdk/openjdk17:alpine-jre
EXPOSE 8080
ADD target/catproduit.jar catproduit.jar
ENTRYPOINT ["jav","jar","/catproduit.jar"]













