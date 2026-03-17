# Burger Shop POS API

A backend REST API for managing a **Burger Shop Point of Sale (POS) system**.
The system allows management of burgers, orders, and sales operations using a **CRUD-based architecture**.

## 🚀 Overview

This API is designed to support a **POS system for a burger shop**, enabling efficient management of menu items and customer orders through RESTful endpoints.

## 🛠 Tech Stack

* **Language:** Java
* **Framework:** Spring Boot
* **ORM:** Hibernate (JPA)
* **Database:** MySQL
* **Architecture:** Layered Architecture (Controller → Service → Repository)
* **Build Tool:** Maven

## 🏗 System Architecture

The project follows a **layered architecture** to ensure clean separation of concerns.

### Controller Layer

Handles REST API requests for:

* Burger management
* Order management
* POS operations

### Service Layer

Contains the **business logic** for managing burgers, orders, and transactions.

### Repository Layer

Uses **Hibernate/JPA repositories** to communicate with the MySQL database.

### Entity Layer

Defines the database models such as **Burger, Order, and Order Items**.

## ⚙ Features

* Create, update, delete, and view **burger menu items**
* Manage **customer orders**
* Perform **CRUD operations** for POS data
* Hibernate-based **database management**
* Scalable backend structure

## 📌 Example Modules

* **Burger Management**
* **Order Management**
* **POS Transaction Handling**

## 📫 Author

**Rasika Madushanka**
Software Engineering Student (HND @ ICET)

---

⭐ This project demonstrates building a **POS backend system using Java, Spring Boot, Hibernate, and MySQL**.
