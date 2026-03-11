# Use Java 17
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy maven files
COPY pom.xml .
COPY src ./src
COPY mvnw .
COPY .mvn ./.mvn

# Build the app
RUN ./mvnw clean package -DskipTests

# Run the app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "target/urlshortener-0.0.1-SNAPSHOT.jar"]
