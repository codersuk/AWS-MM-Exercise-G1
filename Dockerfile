
FROM openjdk:8

COPY Service-1/ /app

WORKDIR /app

CMD  /app/app.jar
