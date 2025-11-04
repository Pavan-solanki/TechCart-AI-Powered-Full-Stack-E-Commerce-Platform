# 🛒 TechCart – AI-Powered Full-Stack E-Commerce Platform

TechCart is an intelligent e-commerce web application where users can browse, search, add, and purchase products.  
Now powered by **Spring AI**, TechCart includes a built-in assistant that answers user and admin queries in real time.

---

## 🚀 Features
- 🔍 Product search and dynamic category filtering  
- 🛍️ Add-to-Cart & secure checkout flow  
- 📦 Real-time stock and order-status management  
- 🤖 **AI Assistant** (Spring AI + OpenAI) for:
  - Querying orders and delivery details  
  - Product recommendations  
  - Admin support (“show pending orders”, “add new category”, etc.)  
- 🔑 Authentication & authorization with role-based access  
- 💾 PostgreSQL + JPA / Hibernate ORM  
- ⚙️ RESTful APIs tested via Postman  

---

## 🧰 Tech Stack
**Backend:** Java | Spring Boot 3 | Spring AI | Spring Data JPA | Hibernate | PostgreSQL  
**Frontend:** React (Vite) | JavaScript (ES6+) | Bootstrap | CSS  
**Tools:** IntelliJ IDEA | VS Code | Postman | Git & GitHub  

---
<img width="1885" height="886" alt="Screenshot 2025-11-04 102923" src="https://github.com/user-attachments/assets/eb3a1ca7-2274-417b-b12e-f1fd771822c4" />

<img width="1896" height="906" alt="Screenshot 2025-10-03 111915" src="https://github.com/user-attachments/assets/64569a6a-e9b6-49f8-8bd2-5140f410d827" />
<img width="1900" height="899" alt="Screenshot 2025-10-03 111939" src="https://github.com/user-attachments/assets/45285154-eac6-46ee-a505-87113d6e6920" />
<img width="1896" height="899" alt="Screenshot 2025-10-03 111954" src="https://github.com/user-attachments/assets/3113be1c-e9c3-431c-85e7-ae5107edf181" />
<img width="1890" height="899" alt="Screenshot 2025-10-03 112013" src="https://github.com/user-attachments/assets/b5228619-82a3-462b-a5cf-5b88c56b506c" />
<img width="1891" height="899" alt="Screenshot 2025-10-03 112031" src="https://github.com/user-attachments/assets/d773479d-753d-4d6e-9552-0788c0a9f39b" />
<img width="1872" height="735" alt="Screenshot 2025-10-03 112513" src="https://github.com/user-attachments/assets/cdaf889a-5ff0-4fe2-8027-f4fc239c3d64" />
## ⚙️ Installation & Setup

### Backend (Spring Boot + PostgreSQL)
```bash
cd backend
# Configure database in application.properties
spring.datasource.url=jdbc:postgresql://localhost:5432/techcart
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
mvn spring-boot:run

