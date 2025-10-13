# Multiservice Application with Docker and Docker Compose
Project which handles a multiservice application with Docker and Docker Compose.

## Services
- **nginx**: A reverse proxy server to handle incoming requests to backend services.
- **service1**: A spring boot application handling users.
- **service2**: A spring boot application handling products.
- **dozzle**: An UI interface used to aggregate and view logs from all services.

## Prerequisites
- Docker installed on your machine.
- Docker Compose installed on your machine.

Each service has its own Dockerfile to build the respective images.</br>
The **docker-compose.yml** file is used to define and run the multi-container Docker application.

**mvn-clean-install** is a script used to fully clean, build and then deploy the application.

http://localhost/users - Used for REST calls routed to the service1 endpoints</br>
http://localhost/products - Used for REST calls routed to the service2 endpoints</br>
http://localhost:8080 - Used to access the dozzle UI interface</br>

Both services can be remote debugged on port 5005 (service1) and 5006 (service2).


