FROM java:8-jdk

VOLUME /var/run/docker.sock

RUN apt-get update 
RUN apt-get install maven -y

RUN mkdir /home/app

WORKDIR /home/app
COPY . /home/app