FROM openjdk:8
EXPOSE 8082
ADD target/StudentResult.jar StudentResult.jar
ENTRYPOINT ["java","-jar","/StudentResult.jar"]
