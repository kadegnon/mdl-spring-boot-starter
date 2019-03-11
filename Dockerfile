# Docker multi-stage build

# 1. Building the App with Maven
FROM maven:3-jdk-11

ADD . /mdl_app
WORKDIR /mdl_app

# Just echo so we can see, if everything is there :)
RUN ls -l

# Run Maven build
RUN mvn clean package


# Just using the build artifact and then removing the build-container
FROM openjdk:8-jdk-alpine

VOLUME /tmp

# Add Spring Boot app.jar to Container
COPY --from=0 "/mdl_app/backend/target/backend-0.0.1-SNAPSHOT.jar" app.jar

ENV JAVA_OPTS=""

# Fire up our Spring Boot app by default
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
