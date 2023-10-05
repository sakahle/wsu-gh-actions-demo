FROM openjdk:22-bullseye
RUN mkdir /app
COPY app.jar /app/
WORKDIR /app
ENTRYPOINT ["java", "-jar", "app.jar"]
