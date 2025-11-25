ARG JAVA_IMAGE=maven:3.9.11-eclipse-temurin-25-noble
# ---- Build Stage ----
FROM ${JAVA_IMAGE} AS builder
WORKDIR /app
VOLUME ["/root/.m2"]
COPY pom.xml .
COPY src ./src
RUN --mount=type=cache,target=/root/.m2 mvn clean install -DskipTests
ENTRYPOINT ["sh", "-c", "exit 0"]
