# Student Management System

The Student Management System is a Java Spring project that allows users to perform CRUD (Create, Read, Update, Delete) operations on student records.

## Technologies Used

- Java 22
- Spring Boot 3.3.0
- Spring Data JPA
- Thymeleaf
- Spring Web
- MySQL
- Lombok
- Bootstrap

## Dependencies

The project uses the following dependencies:

- `spring-boot-starter-data-jpa`: Provides support for JPA (Java Persistence API) and database integration.
- `spring-boot-starter-thymeleaf`: Enables the use of Thymeleaf as a template engine for rendering views.
- `spring-boot-starter-validation`: Provides support for validation of input data.
- `spring-boot-starter-web`: Enables building web applications using Spring MVC.
- `mysql-connector-j`: MySQL JDBC driver for connecting to a MySQL database.
- `lombok`: Provides annotations for reducing boilerplate code.
- `spring-boot-starter-test`: Provides support for writing and running tests.

## Configuration

The application configuration is specified in the `application.properties` file located in the project's root directory. This file contains the following properties:

- `spring.application.name`: The name of the application.
- `spring.datasource.url`, `spring.datasource.username`, and `spring.datasource.password`: The database connection details.
- `spring.jpa.properties.hibernate.dialect`: The Hibernate dialect for MySQL.
- `spring.jpa.hibernate.ddl-auto`: The strategy for automatically creating or updating database tables.
- `spring.jpa.hibernate.show_sql` and `spring.jpa.hibernate.format_sql`: Settings for logging SQL statements.

## Packages

### controller

This package contains the `StudentController` class, which handles HTTP requests and maps them to appropriate methods.

### dto

This package contains the `StudentDto` class, which is a Data Transfer Object used to transfer data between the controller and service layers.

### entity

This package contains the `Student` class, which represents the entity model for the student data stored in the database.

### mapper

This package contains the `StudentMapper` class, which is responsible for mapping between the `Student` and `StudentDto` objects.

### repository

This package contains the `StudentRepository` interface, which extends the `JpaRepository` and provides methods for interacting with the database.

### service

This package contains the `StudentService` interface and its implementation `StudentServiceImpl`. The service layer handles business logic and interacts with the repository layer for data access operations.

## Views (Templates)

The project uses Thymeleaf as the template engine for rendering HTML views. The templates are stored in the `src/main/resources/templates` directory.

- `create_student.html`: Displays a form for creating a new student.
- `edit_student.html`: Displays a form for editing an existing student.
- `students.html`: Displays a list of all students and provides links for editing, deleting, and viewing individual students.
- `view_student.html`: Displays the details of a specific student.

## Running the Application

To run the Student Management System, follow these steps:

1. Make sure you have MySQL installed and running.
2. Update the `application.properties` file with your MySQL database credentials.
3. Build the project using Maven: `mvn clean install`
4. Run the application using the Spring Boot Maven plugin: `mvn spring-boot:run`

The application will start, and you can access it at `http://localhost:8080/students`.

