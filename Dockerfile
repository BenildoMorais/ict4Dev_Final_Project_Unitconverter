FROM openjdk:22-jdk

RUN apt-get instal maven -y
RUN mvn clean instal

ARG JAR_FILE=/target/*.jar
COPY --from=build ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]