# Proof of Concept - JDBC + Spring Boot

## Description

project created to show how JDBC works in the context of the Spring Boot application connected to the MYSQL database

## Getting Started

### DataBase in docker

Run docker container with mysql database
```
docker run --name my-mysql -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=mydb -p 3306:3306 -d mysql
```

or same as up but with Volume

```
docker run --name my-mysql -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=mydb -v /path/to/your/sql/files:/docker-entrypoint-initdb.d -p 3306:3306 -d mysql
```

### Executing program
in project path open terminal

```
mvn clean install
mvn spring-boot:run
```
