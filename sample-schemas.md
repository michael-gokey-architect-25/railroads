Here's a rundown of **popular sample schemas** across major database platforms:

---

### **1. IBM DB2 + WebSphere**

* **IBM Sample Schemas (DB2)**

  * **`SAMPLE`**: Comes with DB2. A basic business scenario with employees, departments, and projects.

    * Tables: `EMPLOYEE`, `DEPARTMENT`, `PROJECT`, `WORKS_ON`, etc.
    * Use: SQL querying, joins, procedures.
  * **`CORPDATA`**: A richer corporate-style schema, often used with advanced topics like OLAP or analytics.

* **WebSphere** (IBM Application Server)

  * Not a database, but a **Java EE application server**.
  * Often paired with DB2 in enterprise environments.
  * Can host enterprise apps using JPA/Hibernate with DB2 backend.
  * Sample Apps: TradeApp (stock trading simulation).

---

### **2. Microsoft SQL Server + Access**

* **SQL Server Sample Databases**

  * **`AdventureWorks`**: Flagship sample for learning everything—SQL queries, stored procs, functions, indexing, etc.

    * Realistic business data: manufacturing, sales, HR.
  * **`WideWorldImporters`**: Newer, optimized for modern SQL Server features (temporal tables, JSON, etc.).

    * More relatable to retail/wholesale businesses.

* **MS Access Sample Databases**

  * **`Northwind`**: A classic small-business example: customers, orders, suppliers, employees.

    * Lightweight, great for ER modeling and Access forms/macros.
  * **`Contoso`**: Another Microsoft demo DB, used in Office demos and Power BI.

    * Often used in Excel, Access, and Power Platform learning.

---

### **3. Oracle**

* **`HR` (Human Resources)**: Most widely used schema for learning joins and constraints.

  * Tables: `EMPLOYEES`, `JOBS`, `DEPARTMENTS`, `LOCATIONS`.
  * Often used in tutorials and certification prep.

* **`SCOTT`**: Old-school demo schema, famous for `EMP` and `DEPT` tables.

  * Tables: `EMP`, `DEPT`, `SALGRADE`.
  * Simple, classic for basic SQL joins.

* **`SH` (Sales History)**: For learning analytics, star schemas, and data warehousing.

  * Tables: `CUSTOMERS`, `PRODUCTS`, `SALES`, `TIMES`.
  * Great for OLAP and BI practice.

---

### **Bonus: Platform-Neutral + Open Source Examples**

* **`Sakila` (MySQL)**: Movie rental schema (think Blockbuster).

  * Tables: `ACTOR`, `FILM`, `CUSTOMER`, `RENTAL`.
  * Very engaging and realistic for learners.

* **`Chinook` (SQLite, MySQL, PostgreSQL, etc.)**: Digital media store like iTunes.

  * Tables: `ARTIST`, `ALBUM`, `CUSTOMER`, `INVOICE`.
  * Nice for practicing with real-world style data and reports.

---


