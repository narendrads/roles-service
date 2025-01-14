FROM openjdk:17-jdk-slim
EXPOSE 9092
ADD target/roles-service.jar roles-service.jar
ENTRYPOINT ["java","-jar","/roles-service.jar"]
