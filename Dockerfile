# Fase 1: Compilar o código usando Maven
FROM maven:3.8.7-openjdk-22 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package

# Fase 2: Construir a imagem final
FROM openjdk:22-jdk
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
