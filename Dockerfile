FROM ubuntu:latest AS build

# Atualiza o sistema e instala os pacotes necessários
RUN apt-get update && apt-get install -y \
    software-properties-common \
    wget \
    curl

# Adiciona o repositório do OpenJDK 22
RUN add-apt-repository ppa:openjdk-r/ppa -y && apt-get update
RUN apt-get install -y openjdk-22-jdk maven

# Define a variável JAVA_HOME
ENV JAVA_HOME="/usr/lib/jvm/java-22-openjdk-amd64"
ENV PATH="$JAVA_HOME/bin:$PATH"

COPY . .

# Compila o projeto
RUN mvn clean install

# Segunda etapa da imagem
FROM openjdk:22-jdk-slim

EXPOSE 8080
COPY --from=build /target/Unitconverter-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
