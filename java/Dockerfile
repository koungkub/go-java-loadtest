FROM maven:3.6.0-jdk-8-alpine as build
WORKDIR /build
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src/ /build/src
RUN mvn package

FROM openjdk:8u201-jre-alpine
WORKDIR /maven
COPY --from=build /build/target/spring.jar spring.jar
ENTRYPOINT ["java", "-jar", "spring.jar", "--server.port=8080"] 
