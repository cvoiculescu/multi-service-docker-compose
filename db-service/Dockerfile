# ---- Build Stage ----
FROM maven:3.9.11-eclipse-temurin-21-noble AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# ---- Runtime Stage ----
FROM eclipse-temurin:21.0.8_9-jre-noble
WORKDIR /app
COPY --from=builder /app/target/*.jar ./app.jar
ENTRYPOINT ["java","-jar","app.jar"]