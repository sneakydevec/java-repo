FROM java:8-jdk

RUN mkdir /home/app

WORKDIR /home/app
COPY . /home/app

RUN chmod +x ./mvnw

EXPOSE 8080