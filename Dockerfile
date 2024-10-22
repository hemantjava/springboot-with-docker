FROM openjdk:17
EXPOSE 9090
ADD target/spring-rest.jar spring-rest.jar
ENTRYPOINT ["java", "-jar","/spring-rest.jar"]