FROM amazoncorretto:8-alpine-jdk
ENV DBHOST=jdbc:postgresql://database-1.cyytfnlchkqs.sa-east-1.rds.amazonaws.com:5432/test
ENV DBHOSTUSER=postgres
ENV DBHOSTPWD=postgresadmin
ENV APPPORT=8080
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
