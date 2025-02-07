# registration_v1

This project is a User Registration System built using Spring Boot and REST APIs. The system allows users to register, login, and manage their accounts securely.

📌 Features
User Registration – New users can sign up with an email and password.
User Login – Users can authenticate using their credentials.
Password Encryption – Secure password storage using BCrypt.
JWT Authentication – Generates and validates JWT tokens for security.
Role-Based Access – Supports different user roles (e.g., USER, ADMIN).
RESTful API – Follows REST principles for client-server interaction.


🛠️ Tech Stack
Spring Boot – Backend framework
Spring Security – Authentication and authorization
JWT (JSON Web Token) – Secure token-based authentication
Spring Data JPA – ORM for database operations
MySQL / PostgreSQL – Database storage
Lombok – Reduces boilerplate code
Maven / Gradle – Dependency management


🗂️ Project Structure
/src
  ├── main/java/com/example/registration
  │     ├── controller         # API Controllers
  │     ├── service            # Business Logic
  │     ├── repository         # Database Access
  │     ├── security           # JWT & Security Config
  │     ├── dto                # Data Transfer Objects
  │     ├── model              # Entity Classes
  ├── resources/
  │     ├── application.yml    # Configuration (DB, Security)

  
📜 API Endpoints
Method	Endpoint	Description
POST	/api/auth/register	Register a new user
POST	/api/auth/login	Authenticate & get JWT
GET	/api/users/me	Get logged-in user info
GET	/api/users/{id}	Get user by ID (Admin)


🛠️ How It Works
User Registration
User sends POST /api/auth/register with email & password.
Password is hashed (BCrypt) before storing in the database.
A user record is created in the database.

User Login
User sends POST /api/auth/login with credentials.
System verifies password & issues JWT token.
Token Authentication

Users send JWT token in the Authorization header.
System validates the token & allows/denies access.


🔧 Installation & Setup
1️⃣ Clone the Repository
git clone https://github.com/yourusername/registration-backend.git
cd registration-backend

2️⃣ Configure Database
Update application.yml with MySQL/PostgreSQL credentials.

3️⃣ Build & Run
mvn clean install
mvn spring-boot:run
🛡️ Security Measures
✅ Password Hashing – Uses BCrypt for secure password storage.
✅ JWT Authentication – Secure access control using tokens.
✅ Role-Based Authorization – Protects API routes using Spring Security.

📌 Next Steps
🔹 Add Email Verification
🔹 Implement Password Reset
