ARG JAVA_IMAGE=maven:3.9.11-eclipse-temurin-25-noble
# ---- Build Stage ----
FROM ${JAVA_IMAGE} AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# ---- Runtime Stage ----
FROM ${JAVA_IMAGE}
WORKDIR /app
COPY --from=builder /app/target/*.jar ./app.jar
ENTRYPOINT ["java","-jar","app.jar"]