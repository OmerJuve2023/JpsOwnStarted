# Json Placeholder API

In this tutorial you will learn how to call a REST API using the JDK's Http Client. In this example you will call a
public REST API and build out an entire CRUD service complete with tests using JUnit 5.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing
purposes.

### Prerequisites

- Java 17 or higher
- Maven
- Docker (optional)

### Installing

A step by step series of examples that tell you how to get a development environment running.

1. Clone the repository

```bash
git clone https://github.com/OmerJuve2023/JpsOwnStarted.git
```

2. Change into the project directory

```bash
cd JpsOwnStarted
```

3. Build the project

```bash
mvn clean install
```

4. Run the project

```bash
mvn spring-boot:run
```

5. Open your browser and navigate to `http://localhost:8080/api/posts`

## Running the tests

To run the tests, execute the following command:

```bash
mvn test
```

## Running the application with Docker

1. Build the Docker image

```bash
docker build -t jps-own-started .
```

2. Run the Docker container

```bash
docker run -p 8080:8080 jps-own-started
```

## Running the application with GraalVM

1. Build the native image

```bash
mvn -Pnative spring-boot:build-image
```

2. Run the native image

```bash
docker run -p 8080:8080 jps-own-started
```

## Authors

- **Omer Juve** - [OmerJuve2023](https://github.com/OmerJuve2023)