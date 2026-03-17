
# 🚀 Veeva Integrated Program – Grand Test

## 📌 Overview
This repository contains solutions for the Veeva Integrated Program – Grand Test, covering automation testing, QA tools integration, and advanced Java application development.

The project demonstrates hands-on implementation of:
- Selenium Automation
- TestNG Integration
- Jira & Xray Usage
- Data-Driven Testing
- Cucumber Framework
- Maven Build Tool
- Advanced Java Programming

---

## 🛠️ Technologies Used
- Java
- Selenium WebDriver
- TestNG
- Maven
- Cucumber
- Jira
- Xray
- Excel (Apache POI for data-driven testing)

---

## 📂 Project Structure
📦 veeva-automation-engineer-roadmap  
 ┣ 📂 src  
 ┃ ┣ 📂 main/java  
 ┃ ┗ 📂 test/java  
 ┣ 📂 test-data  
 ┣ 📂 features (Cucumber)  
 ┣ 📜 pom.xml  
 ┣ 📜 testng.xml  
 ┗ 📜 README.md  

---

## ✅ Implemented Tasks

### 🔹 1. Data-Driven Testing
- Test data (usernames & passwords) is fetched from:
  - Excel files (using Apache POI)
  - Configuration files
- Enables dynamic and reusable test execution.

---

### 🔹 2. Handling Frames in Selenium
- Switching between frames using:
  - Index
  - Name/ID
  - WebElement
- Demonstrates interaction with elements inside nested frames.

---

### 🔹 3. TestNG Integration
- Implemented annotations:
  - @Test
  - @BeforeMethod
  - @AfterMethod
- Structured and modular test execution with setup and teardown.

---

### 🔹 4. Jira Automation & JQL

✔ Auto Assignment Rule
- Automatically assigns bugs to developers
- Sets priority to Highest

✔ JQL Query
project = P1 AND issuetype = Bug AND status != Done AND assignee = currentUser()

---

### 🔹 5. Test Management

✔ Exploratory Testing
- Created test cases focusing on:
  - Edge cases
  - User behavior scenarios
  - Unexpected workflows

✔ Sprint/Release Tracking
- Used Jira dashboards and reports to:
  - Monitor sprint progress
  - Track issue completion

---

### 🔹 6. Xray – Failed Test Re-execution
- Implemented re-execution of failed tests using:
  - TestNG rerun mechanism
  - Xray test execution tracking

---

### 🔹 7. Java Application – Order Processing System

📌 Features:
- Item Management
  - Name, Price, Quantity, Reorder Level
- Customer Management
  - Name, Address, Phone, Email
- Order Processing
  - Multiple items per order
  - Stores transaction date & total amount

⚙️ Business Logic:
- Prevents order placement if:
  Quantity in hand ≤ Reorder Level

Supports:
- Search item by name
- Filter items by price
- Fetch order by Order ID
- Get orders by customer name
- Highest & lowest transactions
- Orders from last week/month

---

## ▶️ How to Run the Project

1. Clone the Repository
git clone https://github.com/chandanamadipalli/veeva-automation-engineer-roadmap.git  
cd veeva-automation-engineer-roadmap  

2. Install Dependencies
mvn clean install  

3. Run Tests
mvn test  

---

## 📊 Key Highlights
- End-to-end automation framework
- Real-world QA tool integration
- Scalable and maintainable code structure
- Covers both testing and development concepts

---

## 👩‍💻 Author
Sri Mani Chandana Madipalli

---

## ⭐ Acknowledgment
This project was developed as part of the Veeva Integrated Program Grand Test to demonstrate practical knowledge in automation testing and software development.

---

## 🔥 Future Enhancements
- Add screenshots of test execution
- Add Jira dashboard visuals
- Add Xray reports
- Deploy reports using GitHub Pages
