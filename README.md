# 💰 Expense Tracker API

A simple and powerful **Spring Boot REST API** to manage personal expenses — built with Java, Spring Boot, and MySQL.

---

## 🚀 Features

- Add, update, delete, and view expenses  
- Store expenses in a MySQL database  
- RESTful API endpoints (JSON-based)  
- Ready for frontend integration (React, Angular, etc.)  
- Cross-Origin support (CORS enabled)

---

## 🛠️ Tech Stack

- **Backend:** Spring Boot (Java)
- **Database:** MySQL
- **Build Tool:** Maven
- **IDE:** VS Code / IntelliJ IDEA
- **API Testing:** Postman

---

## ⚙️ Setup Instructions

### 1️⃣ Clone the repository
```bash
git clone https://github.com/sudhirao23/expensetracker.git
cd expensetracker

CREATE DATABASE expensetracker;

spring.datasource.url=jdbc:mysql://localhost:3306/expensetracker
spring.datasource.username=sudhir
spring.datasource.password=sudhir123
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.application.name=expensetracker


mvn spring-boot:run
http://localhost:8080

{
  "title": "Groceries",
  "category": "Food",
  "amount": 250.75,
  "date": "2025-10-29"
}
