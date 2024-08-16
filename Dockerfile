#  OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the built jar file from the host to the container
COPY target/library-management-api-0.0.1-SNAPSHOT.jar /app/library-management-api.jar

# Expose the port on which the application will run
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "library-management-api.jar"]