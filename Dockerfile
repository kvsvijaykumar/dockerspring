FROM openjdk:8
EXPOSE 8080
ADD target/docker-spring-0.0.1-SNAPSHOT.jar docker-spring-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/docker-spring-0.0.1-SNAPSHOT.jar"]
