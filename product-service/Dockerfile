# ---- Build Stage ----
FROM maven:3.9.8-eclipse-temurin-21 AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# ---- Runtime Stage ----
FROM eclipse-temurin:21.0.8_9-jre-jammy
WORKDIR /app
COPY --from=builder /app/target/*.jar ./app.jar
EXPOSE 8080 5005
ENTRYPOINT ["java","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005","-Djava.net.preferIPv4Stack=true","-jar","app.jar"]