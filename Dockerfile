FROM java:8-jdk

VOLUME /var/run/docker.sock

RUN RUN apt-get update && apt-get install maven -y

RUN mkdir /home/app

WORKDIR /home/app
COPY . /home/app

RUN chmod 777 ./mvnw