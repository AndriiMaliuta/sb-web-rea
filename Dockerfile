FROM gradle:7.4-jdk-alpine AS BUILD
COPY . .
RUN ./gradlew buildJar

FROM openjdk:11.0.14-slim
COPY --from=BUILD ./build/libs/*.jar ./app.jar
CMD["java", "-jar", "app.jar"]

