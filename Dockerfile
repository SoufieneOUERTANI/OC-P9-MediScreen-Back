FROM openjdk:11
MAINTAINER ouertani.com
ARG JAR_FILE=target/docker-mediscreen-patient-1.0.1.jar
COPY ${JAR_FILE} mediscreen-patient-1.0.1.jar
#EXPOSE 8081
ENTRYPOINT ["java","-jar","/mediscreen-patient-1.0.1.jar"]