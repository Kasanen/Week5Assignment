# FROM maven:latest
# LABEL authors="kak3r"

# WORKDIR /app

# COPY pom.xml .

# COPY . /app
# RUN mvn package
# CMD ["java", "-jar", "target/lampotila.jar"]

FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests
RUN jar xf target/lampotila.jar META-INF/MANIFEST.MF && cat META-INF/MANIFEST.MF

FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/target/lampotila.jar app.jar

CMD ["java", "-jar", "app.jar"]