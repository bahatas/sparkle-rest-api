## Sparkle REST API

Welcome to the **Sparkle rest** API, built with Spring Boot 2.7.9 and Java 11. This is the backend of our MVP, which aims to provide <brief description of the project>. Our RESTful API is designed to be highly scalable, reliable, and easy to use.

## Getting Started

### Prerequisites

- Java 11 
- Maven 3 
- PostgreSql
- Docker

### Installation

1. Clone the repository: `git clone <repository url>`
2. Install dependencies: `mvn install`
3. Run docker-compose -f docker-compose-postgreOnly up
3. Start the server: `mvn spring-boot:run`
4. Navigate to `http://localhost:8085` in your web browser to access the API documentation.

## API Documentation

The **<project name>** API has the following endpoints:

- `/api/v1/companies/list` - List of all companies


Please refer to the API documentation for detailed information on each endpoint.

## Development

### Built With

- Spring Boot 2.7.9
- Java 11


### Contributing

We welcome contributions from the community! To get started:

1. Fork the repository
2. Create your feature branch: `git checkout -b feature/<feature>`
3. Commit your changes: `git commit -m '<commit message>'`
4. Push to the branch: `git push origin feature/<feature>`
5. Submit a pull request

### Code Style

We follow the Google Java Style Guide for our code formatting. Please make sure your code follows these guidelines before submitting a pull request.

## Deployment

The **<project name>** API is deployed using Docker and Kubernetes. To deploy the API to your own environment, follow these steps:

1. Install Docker and Kubernetes on your server.
2. Build a Docker image: `docker build -t <image name> .`
3. Push the Docker image to a Docker registry: `docker push <image name>`


## License

This project is licensed under the MIT License - see the LICENSE file for details.

