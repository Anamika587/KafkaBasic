
# Project Title

A brief description of what this project does and who it's for
# Kafka Basic Project

## Overview
This project demonstrates the basic usage of **Apache Kafka** by implementing a simple producer-consumer model using **Spring Boot**. The producer sends messages to a Kafka topic, and the consumer listens to the topic and processes the messages.

## Features
- **Kafka Producer:** Sends messages to a Kafka topic.
- **Kafka Consumer:** Listens for messages from the Kafka topic and processes them.
- **Spring Boot Integration:** Uses Spring Boot for easy configuration and development.

## Prerequisites
Before running the project, ensure you have the following installed:
- **Java 8+**
- **Apache Kafka** (Download from [Kafka Official Website](https://kafka.apache.org/))
- **Spring Boot 3+**
- **Maven** (for dependency management)

## Setup & Running the Project

### Step 1: Start Kafka Server
Ensure that **Kafka and Zookeeper** are running:
```sh
# Start Zookeeper
bin/zookeeper-server-start.sh config/zookeeper.properties

# Start Kafka Server
bin/kafka-server-start.sh config/server.properties
```

### Step 2: Create Kafka Topic
Run the following command to create a topic named `test-topic`:
```sh
bin/kafka-topics.sh --create --topic test-topic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1
```

### Step 3: Clone the Repository
```sh
git clone https://github.com/Anamika587/KafkaBasic.git
cd KafkaBasic
```

### Step 4: Run the Spring Boot Application
Use Maven to build and run the application:
```sh
mvn spring-boot:run
```

### Step 5: Test the Producer
Send a POST request using **Postman** or **cURL**:
```sh
curl -X POST -H "Content-Type: application/json" -d "Hello Kafka" http://localhost:8080/produce
```

### Step 6: Check Consumer Logs
Once the message is produced, the consumer should pick it up and display it in the application logs.

## Project Structure
```
KafkaBasic/
│── src/main/java/com/example/kafka
│   ├── config/KafkaConfig.java  # Kafka Configuration
│   ├── controller/KafkaController.java  # REST Controller for Producing Messages
│   ├── producer/KafkaProducer.java  # Kafka Producer Service
│   ├── consumer/KafkaConsumer.java  # Kafka Consumer Listener
│── src/main/resources/application.yml  # Spring Boot Configurations
│── pom.xml  # Maven Dependencies
│── README.md  # Project Documentation
```

## Dependencies (Maven)
Ensure the following dependencies are included in `pom.xml`:
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.kafka</groupId>
    <artifactId>spring-kafka</artifactId>
</dependency>
```

## Conclusion
This project serves as a simple demonstration of Kafka with Spring Boot. You can extend it by adding more topics, error handling, and persistence mechanisms.

Feel free to contribute, and happy coding! 🚀


