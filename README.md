# 📚 Student Management System (Java + MySQL)

A simple console-based Student Management System built using Core Java, JDBC, and MySQL.  
This project performs full CRUD operations (Create, Read, Update, Delete) on student records and demonstrates clean project structure using DAO pattern.

## 🚀 Features

- ➕ Add new student  
- 📋 View all students  
- ✏️ Update student details  
- 🗑️ Delete student by ID  
- 🔗 MySQL database connectivity using JDBC  
- 🧱 Clean structure:
  - Model (Student)
  - DAO (StudentDAO)
  - DB Utility (DBConnection)
  - UI (Main)

## 🛠️ Tech Stack

- Java (Core Java, OOP)
- JDBC
- MySQL
- Eclipse IDE
- Git & GitHub
- 
## 📂 Project Structure

src/com/sms  
 ├── DBConnection.java  
 ├── Student.java  
 ├── StudentDAO.java  
 └── Main.java  <span class="ͼfp ͼfo">##</span>

## 🗄️ Database Setup 

```sql
CREATE DATABASE sms;

USE sms;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    age INT,
    branch VARCHAR(50)); 

## ⚙️ Configuration

In `DBConnection.java`, update:
```java
private static final String URL = "jdbc:mysql://localhost:3306/sms";
private static final String USER = "root";
private static final String PASSWORD = "your_password_here";
Also add MySQL Connector/J to the project build path.

## ▶️ How to Run

1.Clone the repository
2.Open in Eclipse
3.Add MySQL Connector JAR
4.Configure DB credentials
5.Run Main.java
6.Use the menu:
  1.Add Student
  2.View All Students
  3.Update Student
  4.Delete Student
  5.Exit

## 🎯 Learning Outcomes

-Java OOP
-JDBC
-MySQL CRUD operations
-DAO pattern
-Console-based application
-Git & GitHub

## 📌 Future Improvements

-Search feature
-Input validation
-GUI or Web version
-Better exception handling

👨‍💻 Author

Chetas J
GitHub: https://github.com/Chetas35
