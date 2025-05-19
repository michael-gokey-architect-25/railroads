Data Infrastructure

Let's delve into Norfolk Southern's (NS) data infrastructure and explore how we can model a simplified version of their system.

---

## 🚂 Norfolk Southern’s Data Infrastructure

### 🖥️ Mainframe Systems

NS relies on a centralized mainframe system known as **OWP.NSCorp**, which handles massive volumes of data, processes transactions, and supports mission-critical applications. This system plays a pivotal role in managing daily operations, ensuring seamless coordination of freight transportation, inventory management, and customer service. ([Tubetorial][1])

### 📊 Data Warehousing

For enterprise data warehousing, NS has historically utilized **Teradata**. This platform supports various applications, including marketing, costing, customer service, and support tools, enabling advanced business intelligence and data mining capabilities. The data warehouse has grown significantly over the years, supporting innovative applications that set industry standards. ([assets.teradata.com][2])

---

## 👨‍💼 Database Roles at Norfolk Southern

NS has employed professionals with expertise in various database systems. For instance, roles such as SQL Database Administrators have been part of their IT infrastructure. These positions typically involve managing and maintaining database systems critical to NS's operations. ([LinkedIn][3])

---

## 🛠️ Building Your Sample System

Given NS's infrastructure, here's how you might approach building a simplified version:

### 🔧 Backend

* **Framework**: Spring Boot
* **Database**: PostgreSQL (for its robustness and support for complex queries)

### 🎨 Frontend

* **Framework**: Angular
* **Design Tool**: Figma (to prototype the user interface, especially for dispatch systems)([LinkedIn][4])

### 📐 Data Modeling

Consider modeling entities such as:

* **Yards**: Representing different rail yards with attributes like location and capacity.
* **Trains**: Including details like train ID, status, and associated yard.
* **Cars**: Each with a unique ID, type, and current load status.
* **Schedules**: Timetables for train departures and arrivals.
* **Routes**: Paths that trains follow, connecting different yards.

This setup allows for simulating operations such as train assembly, dispatching, and tracking.

---

Next Steps:
- setting up the initial database schema 
- creating a Figma wireframe for the dispatch interface

[1]: https://www.tubetorial.com/unlocking-the-power-of-owp-nscorp-mainframe-a-comprehensive-guide-to-norfolk-southerns-mainframe-system/"
[2]: https://assets.teradata.com/resourceCenter/downloads/CaseStudies/EB6598.pdf"
[3]: https://www.linkedin.com/in/claude-young-9906929b"
[4]: https://www.linkedin.com/in/amishras."
