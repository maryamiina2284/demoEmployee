# 🧑‍💼 Demo Employee Management System

This is a simple **Spring Boot CRUD application** that allows you to manage employee records via a web interface.

## 📁 Project Structure

demoEmployee/
├── src/

│ ├── main/

│ │ ├── java/com/exampleEmployee/

│ │ │ ├── Employee.java

│ │ │ ├── EmployeeController.java

│ │ │ ├── EmployeeRepository.java

│ │ │ ├── EmployeeService.java

│ │ │ └── Main.java

│ │ └── resources/

│ │ ├── static/

│ │ ├── templates/

│ │ │ ├── EditEmployee.html

│ │ │ ├── home.html

│ │ │ ├── ListEmployee.html

│ │ │ ├── Register.html

│ │ │ └── viewAll.html

│ │ └── application.properties

├── Docker-compose.yml

├── pom.xml

└── README.md


## 🔧 Technologies Used

- Java 20
- Spring Boot 3.3.1
- Spring Data JPA
- PostgreSQL
- Thymeleaf
- HikariCP
- Maven

## ⚙️ Getting Started

### 🛠️ Prerequisites
- Java 17+
- PostgreSQL installed and running
- Maven installed

### ⚙️ Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/demoEmployee.git
   cd demoEmployee



## Configure the database:

Edit src/main/resources/application.properties:

   spring.datasource.url=jdbc:postgresql://localhost:5432/your_db_name
   
   spring.datasource.username=postgres
   
   spring.datasource.password=your_password
   
   spring.jpa.hibernate.ddl-auto=update


## Run the application:

  ## ``bash
   mvn spring-boot:run
   Visit the app at http://localhost:8080

## 📦 Features

   ✅ Add Employee
   
   ✅ View All Employees
   
   ✅ Edit Employee Details
   
   ✅ Delete Employee
