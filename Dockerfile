FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/*.jar appAuthentication.jar
ENTRYPOINT ["java","-jar","/appAuthentication.jar"]