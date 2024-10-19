FROM openjdk:17-jdk-alpine
COPY ./target/dockerdemospringboot-0.0.1-SNAPSHOT.jar dockerdemospringboot.jar
ENTRYPOINT ["java", "-jar","/dockerdemospringboot.jar"]
