# railroads
A place to work on my railroad model designs


**Table of Contents** summarizing everything I have

---

## 🧠 **Table of Contents: Rail Yard Dispatch System (End-to-End Spring Boot + Angular Project)**

### 🔹 **[1. Sample Database Schemas for Learning](https://github.com/michael-gokey-architect-25/railroads/blob/main/sample-schemas.md "sample learning schemas across major database platforms")**

* Summary of sample schemas from:

  * Microsoft SQL Server (AdventureWorks, Northwind)
  * Access (Northwind)
  * Oracle (HR, OE)
  * IBM Db2 (Employee/Project sample, WebSphere middleware note)
  * PostgreSQL (Pagila, DVDRental)
  * MySQL (Sakila, World)

---

### 🚂 **[2. Rail Yard Domain Modeling](https://github.com/michael-gokey-architect-25/railroads/blob/main/Railroad-Operations-Model.md "Key Concepts to Model in Railroad Operations")**



* Brainstormed data elements and entities:

  * Yards
  * Routes
  * Trains
  * Cars
* Discussed use of NMRA, rail ops resources, and model train inspiration

---

### 💾 **3. Tech Stack & DB Strategy**

- [Data Infrastructure](https://github.com/michael-gokey-architect-25/railroads/blob/main/Data-Infrastructure.md "Simplified Model Data Infrastructure Ideas")
- [Technical Landscape](https://github.com/michael-gokey-architect-25/railroads/blob/main/Railroad-Tech-Landscape.md 'Core Data Systems and Technical Landscape')

* Best DB choice for Spring Boot integration:

  * ✅ PostgreSQL chosen for compatibility, ease of use, and strong Spring Boot support
* PostgreSQL `application.properties` sample

---

### 🏗️ **4. Entity Models (Java)**

For each of the following:

* **Train.java**
* **Route.java**
* **Yard.java**
* **Car.java**

Each included:

* Fields
* Relationships (`@ManyToOne`, `@OneToMany`, etc.)
* `@Entity`, `@Table`, `@Id`, `@GeneratedValue`

---

### 🧩 **5. Spring Boot Layers**

Generated for each domain:

* `@Repository` interfaces
* `@Service` classes
* `@RestController` endpoints

CRUD operations included.

---

### 🌐 **6. Swagger API Documentation**

* Auto-generated Swagger YAML (OpenAPI 3.0)

  * Endpoints for all 4 domains: `Train`, `Route`, `Yard`, `Car`
  * REST paths, models, and HTTP methods

---

### 📮 **7. Postman Testing Collection**

* Collection `.json` file structure (described)
* Testing Documentation:

  * Setup instructions
  * Base URL placeholder
  * Sample test case usage

---

### 🧪 **8. Test Case Examples**

* Test cases written for:

  * Train endpoints
  * Route endpoints
  * Car endpoints
  * Yard endpoints
* Methods included:

  * `POST`, `GET`, `PUT`, `DELETE`
* Example assertions included

---

### 🎨 **9. Figma UX Design Concept**

* Designed layout concept for:

  * Rail Yard dispatch system dashboard
  * Actions like: "Assign Car", "Track Train", "Add Yard"
* Sample wireframe uploaded
* Discussed Figma layout strategy & navigation model

---

## 📦 Output Files

* `sample-database-schemas.md`
* Java files for all 4 entities and their CRUD layers
* `application.properties`
* `swagger.yaml`
* Postman Collection JSON
* Figma notes and exported assets 

---
*This and all documents in this GitHub repo are my ideas. I have no actual knowledge of their systems, other than what you can find on the web about them, from white papers, job descriptioons and what you can find in other public open web places. None of this information is from them. I am just guessing and making stuff up based on my ideas.*


---
- [link words](LINK 'title')

