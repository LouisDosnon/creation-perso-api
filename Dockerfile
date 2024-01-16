FROM eclipse-temurin:20-alpine
VOLUME /tmp
COPY build/libs/creation-perso-api-0.0.1-SNAPSHOT-plain.jar creation-perso-api-0.0.1-SNAPSHOT-plain.jar
ENTRYPOINT ["java","-jar","/creation-perso-api-0.0.1-SNAPSHOT-plain.jar"]
EXPOSE 8080
