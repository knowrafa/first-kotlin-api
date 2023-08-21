FROM openjdk:17-jdk-slim

# Install Maven
RUN apt-get update && apt-get install -y maven


# Copy your application's code into the container
COPY . /app

# Set the working directory to the application's code
WORKDIR /app

RUN mvn clean install -DskipTests

# Run the application
#  --spring.config.location=/src/main/resources/application.yml
CMD ["./start.sh"]