FROM maven:latest
LABEL authors="kak3r"

WORKDIR /app

COPY pom.xml .

COPY . /app
RUN mvn package
CMD ["java", "-jar", "target/lampotila.jar"]