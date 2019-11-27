FROM openjdk:8-jdk-alpine
ADD target/joinme-1.0.0-SNAPSHOT.jar joinme-1.0.0-SNAPSHOT.jar
ENTRYPOINT ["sh", "-c", "java -jar /joinme-1.0.0-SNAPSHOT.jar"]