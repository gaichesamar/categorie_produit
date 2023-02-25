FROM openjdk:17-jdk-alpine
VOLUME /tmp
COPY target/produit-1.0.0.jar produit-1.0.0.jar
ENTRYPOINT ["jav","jar","/produit-1.0.0.jar"]













