# Multiservice Application with Docker and Docker Compose
Project which handles a multiservice application with Docker and Docker Compose.

## Services
- **nginx**: A reverse proxy server to handle incoming requests to backend services.
- **user-service**: A spring boot application handling users.
- **product-service**: A spring boot application handling products.
- **db-service**: A service used for deploying POSTGRESQL database and using Liquibase for database migrations.
- **dozzle**: An UI interface used to aggregate and view logs from all services.

## Prerequisites
- Docker installed on your machine.
- Docker Compose installed on your machine.

Each service has its own Dockerfile to build the respective images.</br>
The **docker-compose.yml** file is used to define and run the multi-container Docker application.

## Running the Application
```bash 
./run-services
```
The acces points are provided thru NGINX reverse proxy as following:</br>
http://localhost/users - Used for REST calls routed to the service1 endpoints</br>
http://localhost/products - Used for REST calls routed to the service2 endpoints</br>

Also, you can have direct access to each backend service and log interface:</br>
http://localhost:8080 - Used to access the dozzle UI interface</br>
http://localhost:8081 - user-service</br>
http://localhost:8082 - product-service</br>

Both services can be remote debugged on ports: 5005 (user-service) and 5006 (product-service).