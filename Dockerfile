FROM amazoncorretto:8-alpine-jdk
ENV DBHOST=jdbc:postgresql://host.docker.internal:5432/test
ENV DBHOSTUSER=postgres
ENV DBHOSTPWD=admin
ENV APPPORT=8080
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]