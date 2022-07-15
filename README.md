## Bank spring application

>Design and implement a REST API that allows to manage Users and their Accounts.

### Requirements

* Java - 1.8.x

* Maven - 3.x.x

* PostgreSQL - 5.x.x

Steps to Setup

1. Clone the application
>git clone https://github.com/vitaly-lab/bank.git

2. Create PostgresSQL database

>CREATE DATABASE IF NOT EXISTS bank;
>
>CREATE USER 'user'@'localhost' IDENTIFIED BY 'user';
>
>GRANT ALL PRIVILEGES ON bank.* TO 'user'@'localhost';

3. Build and run the app using maven

  *   mvn package
  *   java -jar target/spring-boot-rest-user-crud-1.0.0.jar
  *   Alternatively, you can run the app without packaging it using -
  *   mvn spring-boot:run
