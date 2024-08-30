
RUN mvn clean package

# Fase 2: Construir a imagem final
FROM openjdk:22-jdk
WORKDIR /app
FROM openjdk:22-jdk
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
