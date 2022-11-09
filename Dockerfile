FROM openjdk:8-jdk-alpine
MAINTAINER Achmad Wibawa <achmadwibawa64@gmail.com>
RUN mkdir -p /app
WORKDIR /app

COPY Utama.java /app

#compile file java
RUN javac Utama.java

#running java
CMD ["java","Utama"]
