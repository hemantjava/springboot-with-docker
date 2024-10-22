# Dockerfile example
* docker build -t spring-rest.jar . 
 build docker image
* docker run -p 7878:9191 spring-rest.jar
 here 9191 is local port(tomcat port) and 7878 is container port