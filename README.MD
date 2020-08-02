# ![CRUD Example App using Java and Spring](icon.png) CRUD Example.
This codebase was created to demonstrate CRUD operations using a simple application built with Spring boot, Hibernate & MySQL.

The code is organised as follows:
1. `config` Spring configuration
2. `controller` contains the rest controller
3. `dao` contains a data access object (DAO) which that provides an abstract interface to the database
4. `model`  is the business model containing entities
5. `service`  contains the services

# Database
A hibernate MySQL database, which can be easily changed in the `application.properties` for any other database.

# Getting started
You need installed:
1. Java 8 
2. MySQL 5+ 

DB schema (Example `db.sql` included), update the `application.properties` to match your db connection

To test that it works, point your browser to http://localhost:8080/api/ping alternatively, you can run
    curl http://localhost:8080/api/ping
    curl http://localhost:8080/api/employees
    
# Help
Please fork & PR to improve the code.
