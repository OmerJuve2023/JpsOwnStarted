# Start with a base image containing Java runtime
FROM openjdk:17-jdk-alpine
COPY target/JpsOwnStarted-1.0.0.jar JpsOwnStarted-1.0.0.jar
ENTRYPOINT ["java","-jar","/JpsOwnStarted-1.0.0.jar"]