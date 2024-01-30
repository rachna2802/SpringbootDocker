# Use an official OpenJDK runtime as a base image
FROM openjdk:latest

# Set the working directory inside the container
WORKDIR /app

# Copy the application JAR file into the container at /app
COPY target/Users-0.0.1-SNAPSHOT.jar /app/Users-0.0.1-SNAPSHOT.jar

# Expose the port that your Spring Boot application will run on
EXPOSE 8082

# Specify the command to run your application
CMD ["java", "-jar", "Users-0.0.1-SNAPSHOT.jar"]