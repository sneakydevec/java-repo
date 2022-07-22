FROM java:8-jdk

VOLUME /var/run/docker.sock

RUN mkdir /home/app

WORKDIR /home/app
COPY . /home/app

RUN chmod +x ./mvnw