## Bank spring application

>Design and implement a REST API that allows to manage Users and their Accounts.

### Requirements

* Java - 1.7.x

* Maven - 3.6.x

* PostgreSQL - 14.x

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
  *   java -jar target/bank-0.0.1-SNAPSHOT.war
  *   Alternatively, you can run the app without packaging it using -
  *   mvn spring-boot:run




