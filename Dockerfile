ROM openjdk:8-jre-alpine

EXPOSE 8080

COPY ./build/libs/course-api-1.0-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "course-api-1.0-SNAPSHOT.jar"]
