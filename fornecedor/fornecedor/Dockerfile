FROM openjdk:8-jdk-alpine
VOLUME /tmp
CMD 'mvn clean package'
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]