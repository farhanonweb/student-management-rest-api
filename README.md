# 🎓 Student Management REST API

A complete RESTful API built using Spring Boot and MySQL.
This project performs full CRUD operations with validation and proper exception handling.

---

## 🚀 Tech Stack

- Java 17
- Spring Boot 3
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL 8
- Maven
- Postman (API Testing)

---

## 🛠️ Database Setup

1. Open MySQL Workbench
2. Run the following command:

CREATE DATABASE student_db;

---

## ⚙️ Application Configuration

Update file:
src/main/resources/application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.port=8080

---

## ▶️ How To Run Project

Open terminal inside project folder and run:

mvn spring-boot:run

Application will start on:

http://localhost:8080

---

# 📌 API Endpoints

Base URL:

http://localhost:8080/api/students

---

## 1️⃣ Add Student

Method: POST  
URL: /api/students  

Request Body (JSON):

{
  "name": "Farhan",
  "email": "farhan@gmail.com",
  "course": "Java",
  "marks": 85
}

Response:

{
  "id": 1,
  "name": "Farhan",
  "email": "farhan@gmail.com",
  "course": "Java",
  "marks": 85
}

---

## 2️⃣ Get All Students

Method: GET  
URL: /api/students  

Response:

[
  {
    "id": 1,
    "name": "Farhan",
    "email": "farhan@gmail.com",
    "course": "Java",
    "marks": 85
  }
]

---

## 3️⃣ Get Student By ID

Method: GET  
URL: /api/students/{id}

Example:
GET /api/students/1

---

## 4️⃣ Update Student

Method: PUT  
URL: /api/students/{id}

Request Body:

{
  "name": "Farhan Updated",
  "email": "farhan@gmail.com",
  "course": "Spring Boot",
  "marks": 90
}

---

## 5️⃣ Delete Student

Method: DELETE  
URL: /api/students/{id}

Response:
Student deleted successfully

---


# 🧪 Testing

Use Postman to test all API endpoints.

---

# 🎯 Learning Outcomes

- Spring Boot with MySQL integration
- JPA & Hibernate
- REST API development
- MVC Architecture
- Validation Handling
- Global Exception Handling
- CRUD operations with database

---

# 👨‍💻 Author

Farhan Gheri  

