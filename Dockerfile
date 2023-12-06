#Add java
FROM openjdk:17-jdk-slim

#Set directory
WORKDIR /app

#Copy target jar file
COPY target/container1User-0.0.1-SNAPSHOT.jar /app

#Expose port so spring boot will run
EXPOSE 8080

#Command required to run the application, run this .jar file in
CMD ["java", "-jar", "container1User-0.0.1-SNAPSHOT.jar"]