# Proof of Concept - JDBC - Spring Boot

## Description
Proof of concept of the implementation of the Java Database Connectivity interface
to show how JDBC works in the context of the Spring Boot application connected to the MYSQL database

## Getting Started

### Database in Docker

Run script for docker container with mysql database

```
database-in-docker.sh
```
Note 1. if you using linux all is ok, but if you using windows you must change it on .cmd and map that script on cmd
Note 2. Default username for database mysql is "root"
Note 3. if you want to change the environment variables MYSQL_ROOT_PASSWORD or MYSQL_DATABASE or PORT you must include it in src/main/resources/application.properties

### Executing program
in project path open terminal

```
mvn clean package
mvn spring-boot:run
```
### Postman
as soon as the tomcat server is up, we can fire url to our application
```
GET localhost:8080/api/users
POST localhost:8080/api/users?firstName=Jan&lastName=Kowalski
```
