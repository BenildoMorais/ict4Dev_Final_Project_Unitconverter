<h1 align='center'> Final Project ict4Dev </h1>

<p align='center'>This application is a unit converter, it was developed using Spring Boot, Thymeleaf and Docker technologies, its purpose is to receive values and convert them from one unit to another, one of the main requirements of the project was that it had five services so it is possible to convert 5 different physical quantities being them, weight, length, temperature, speed and time, all you have to do is choose the input unit then the output unit, enter the value and the value is calculated.</p>

<div align='center'>
  <a href="https://spring.io/" target="_blank">
      <img src="https://upload.wikimedia.org/wikipedia/commons/4/44/Spring_Framework_Logo_2018.svg" width="150" height="150" />
  </a>

  <a href="https://www.thymeleaf.org/" target="_blank">
      <img src="https://www.thymeleaf.org/images/thymeleaf.png" width="150" height="150" />
  </a>

  <a href="https://www.docker.com/" target="_blank">
      <img src="https://www.docker.com/wp-content/uploads/2023/08/logo-guide-logos-1.svg" width="150" height="150" />
  </a>
</div>

## 🔧 Tools

-   Spring Boot: Is a Java framework that simplifies developing web applications and microservices by providing tools to create production-ready applications with minimal configuration.
-   Thymeleaf: Is a Java template engine used to create dynamic web pages. It integrates with Spring Boot to simplify the development of server-side rendered views, allowing for easy embedding of logic in HTML templates.
-   Docker: Is a platform that simplifies the development, shipping, and running of applications by using containerization, allowing apps to run consistently across different environments with minimal configuration.

## 📍 Services

- `LengthService`: The service is responsible for converting length units between meters, kilometers, miles, yards and inches.
- `SpeedService`: The service is responsible for converting speed units between meters per second, kilometers per hour, miles per hour, knots and feet per second.
- `TemperatureService`: The service is responsible for converting temperature units between Celsius, Fahrenheit, Kelvin and Rankine.
- `TimeService`: The service is responsible for converting time units between seconds, minutes, hours, days, weeks and years.
- `WeightService`: The service is responsible for converting weight units between grams, kilograms, tons, pounds and ounces.

## 📄 Data Model

- `Unit`:
    - `intputId` (int): value that identifies the input unit.
    - `outputId` (int): value that identifies the output unit.
    - `value` (float): value to be converted.

All services in this aplication uses the same data model, that´s why we have one data model, usually on big project we have different models for each service.

## 💻 How to execute the project

Follow these steps to configure and run the Application in your environment:

1. Clone this project:

  ```shell
  git clone https://github.com/BenildoMorais/ict4Dev_Final_Project_Unitconverter.git
  ```
2. Navigate to the project directory:

  ```shell
  cd nameOfProject/
  ```
3. Run the following command:

  ```shell
  docker run -p 8080:8080 unitconvert
  ```

The application will be accessible at http://localhost:8000/


## 🙏 conclusion:

The application was a course project that only lasted a week, but the knowledge will last forever.
In a short space of time, I was able to consolidate different concepts about developing distributed web applications using Java.
I'd like to take this opportunity to thank the people who made this course possible.