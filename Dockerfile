FROM java:8-jdk

RUN mkdir /home/app

WORKDIR /home/app
COPY . /home/app

EXPOSE 8080

CMD ["./mvnw", "spring-boot:run"]