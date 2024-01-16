FROM eclipse-temurin:20-alpine
VOLUME /tmp
COPY build/libs/creation-perso-api-0.0.1-SNAPSHOT.jar creation-perso-api-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/creation-perso-api-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080
