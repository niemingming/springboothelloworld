FROM java:8u111-jre
add springboothelloworld-1.0-SNAPSHOT.jar  /application.jar
EXPOSE 8080
CMD ["java","-jar","application.jar"]