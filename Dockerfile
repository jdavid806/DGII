# Etapa de build con Maven + Java 21
FROM maven:3.9.6-eclipse-temurin-21 AS builder

WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn clean package -DskipTests

# Etapa final con JDK 24 para ejecutar
FROM eclipse-temurin:24-jdk

WORKDIR /app

# Copiar el JAR generado exactamente por nombre
COPY --from=builder /app/target/DGII-0.0.1-SNAPSHOT.jar app.jar
RUN ls -l /app

EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]
