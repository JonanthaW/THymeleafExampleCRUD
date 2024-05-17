FROM amazoncorretto:17
LABEL authors="jon"

WORKDIR /app

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} /app/application.jar

CMD apt-get update -y

EXPOSE 8080
CMD ["java", "-jar", "application.jar"]