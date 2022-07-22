FROM openjdk:8-alpine

VOLUME /var/run/docker.sock

RUN apk add --update maven

RUN mkdir /home/app

WORKDIR /home/app
COPY . /home/app