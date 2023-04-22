# Proof of Concept - JDBC - Spring Boot

## Description

project created to show how JDBC works in the context of the Spring Boot application connected to the MYSQL database

## Getting Started

### Database in Docker

Run docker container with mysql database
```
docker run --name my-mysql -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=mydb -p 3306:3306 -d mysql
```

or same as up but with Volume

```
docker run --name my-mysql -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=mydb -v /path/to/your/sql/files:/docker-entrypoint-initdb.d -p 3306:3306 -d mysql
```
Note 1. Default username for database mysql is "root"
Note 2. if you want to change the environment variables MYSQL_ROOT_PASSWORD or MYSQL_DATABASE or PORT you must include it in src/main/resources/application.properties

### Executing program
in project path open terminal

```
mvn clean install
mvn spring-boot:run
```
### Postman
as soon as the tomcat server is up, we can fire url to our application
```
GET localhost:8080/api/users
POST localhost:8080/api/users?firstName=Jan&lastName=Kowalski
```
