# TUM Department of Architecture - Research Platform Web App

This project is based on Java Spring (JDK11). Database used is MongoDB.

## Run locally

#####Ensure tests are running successfully
To ensure both API and integration tests are running successfully, run the following in the root directory:

```
./mvnw test
```

#### Build the project
To build, run the command: `./mvnw install -DskipTests=true` in the root directory.

#### Setup MongoDB locally
To setup a local database instance, install the community server from [here](https://www.mongodb.com/download-center/community) and set it up to start at **localhost** with port **27017** without any authentication.

#### Running the Spring Boot module
To run the Spring Boot module and connect to a local db instance run the command: `./mvnw spring-boot:run` in the root directory. This will attempt to connect to a mongodb instance running locally on **localhost** with port **27017**.

#### Information
Spring service will start on **localhost** on port **5000**.

## Run with Docker
To run with docker, simply run `docker-compose up`. This will start the spring service on a container exposed to port 5000. This docker based service is connected to the main db deployed online.

## Swagger UI for REST API Documentation (Relative URL)
`/swagger-ui.html`
