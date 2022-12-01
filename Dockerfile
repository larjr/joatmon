FROM amazoncorretto:17-alpine-jdk
MAINTAINER larjr.com.br
COPY target/joatmon-0.0.1-SNAPSHOT.jar joatmon-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/joatmon-0.0.1-SNAPSHOT.jar"]