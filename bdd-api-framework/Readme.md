# 🚀 API Test Automation Framework

## 📌 Overview

This project is a **Hybrid API Automation Framework** developed using **Java, REST Assured, and Cucumber (BDD)**.
It automates and validates REST APIs using the **Swagger Petstore API**.

The framework is designed to be:

* Scalable
* Maintainable
* Reusable
* Aligned with industry best practices

---

## 🎯 Objectives

* Automate REST API testing using REST Assured
* Implement Behavior-Driven Development (BDD) using Cucumber
* Perform CRUD operations with API chaining
* Validate cross-endpoint data consistency
* Implement negative testing scenarios
* Generate execution reports
* Execute tests using Maven

---

## 🛠️ Tech Stack

* **Java 21**
* **REST Assured**
* **Cucumber (BDD)**
* **Maven**
* **Postman**
* **IntelliJ IDEA**
* **Git**

---

## 🧱 Framework Architecture

The framework follows a layered architecture:

```
Feature Files (BDD)
        ↓
Step Definitions
        ↓
Client Layer (PetClient)
        ↓
REST Assured
        ↓
Swagger Petstore API
```

---

## 📂 Project Structure

```
bdd-api-framework
 ├── src
 │   ├── test
 │   │   ├── java
 │   │   │   ├── client
 │   │   │   ├── stepdefinitions
 │   │   │   ├── runners
 │   │   ├── resources
 │   │       ├── features
 ├── pom.xml
```

---

## 🧪 Test Scenarios Implemented

### ✅ Test Case 1: Pet Lifecycle (CRUD)

* Create pet
* Get pet by ID
* Update pet
* Delete pet
* Validate responses

### ✅ Test Case 2: Inventory Analysis

* Fetch inventory
* Compare available pet count

### ✅ Test Case 3: Negative Testing

* Invalid user creation
* Non-existing user fetch
* Invalid login

### ✅ Test Case 4: Cross-Endpoint Validation

* Create pet
* Update to "sold"
* Verify in sold list

---

## 🔗 API Used

* Swagger Petstore API
  👉 https://petstore.swagger.io/

---

## ▶️ How to Run

### Prerequisites

* Java 21
* Maven
* IntelliJ IDEA

### Steps

```bash
git clone <your-repo-link>
cd bdd-api-framework
mvn clean test
```

---

## 📊 Execution Reports

Reports are generated in:

```
target/surefire-reports
```

---

## 📸 Screenshots

### 🧪 Test Execution

(Add your IntelliJ / Maven screenshot here)

### 🔧 Postman Validation

(Add your Postman screenshot here)

### 📂 Project Structure

(Add project structure screenshot here)

---

## 🔄 Version Control

* Git used for version tracking
* Incremental commits maintained

---

## 📌 Key Features

* API chaining
* BDD implementation
* Reusable client layer
* Cross-endpoint validation
* Negative testing
* Maven execution

---

## 🎯 Conclusion

This project demonstrates a real-world API automation framework with strong fundamentals in testing, design, and execution. It reflects practical knowledge aligned with industry standards.

---
