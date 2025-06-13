# 🏥 PATIENT-MANAGEMENT-SYSTEM

**Empowering Healthcare Through Seamless Patient Care**


![Java](https://img.shields.io/badge/java-94.3%25-blue)
![Languages](https://img.shields.io/badge/languages-3-blue)

---

## 🚀 Overview

**Patient-Management-System** is a modular, microservices-based healthcare platform designed for managing patient data, billing, authentication, and real-time analytics. It emphasizes security, scalability, and automation — all built with modern technologies.

---

## 🧰 Built With

| Technology | Badges |
|-----------|--------|
| **Backend** | ![Java](https://img.shields.io/badge/-Java-blue) ![Spring](https://img.shields.io/badge/-Spring-brightgreen) |
| **Infrastructure** | ![Docker](https://img.shields.io/badge/-Docker-blue) ![AWS CDK](https://img.shields.io/badge/-AWS%20CDK-orange) ![LocalStack](https://img.shields.io/badge/-LocalStack-gray) |
| **Other Tools** | ![gRPC](https://img.shields.io/badge/-gRPC-lightgrey) ![Kafka](https://img.shields.io/badge/-Kafka-black) ![JSON](https://img.shields.io/badge/-JSON-black) ![Bash](https://img.shields.io/badge/-GNU%20Bash-green) ![XML](https://img.shields.io/badge/-XML-blue) |

---

## 📚 Table of Contents

- [Overview](#-overview)
- [Getting Started](#-getting-started)
- [Features](#-features)
- [Installation](#-installation)
- [Usage](#-usage)
- [Testing](#-testing)
- [Contact](#-contact)

---

## ✨ Features

✅ **Microservices Architecture** — Separate services for auth, patient, billing, and analytics for maintainability.  
🔐 **Secure Authentication** — JWT-based login with token validation and role-based access.  
📡 **API-Driven Communication** — REST + gRPC for efficient internal and external service interaction.  
📊 **Real-Time Analytics** — Kafka for streaming and event-driven processing.  
🐳 **Containerized Deployment** — Docker for consistent dev, test, and prod environments.  
⚙️ **Infrastructure as Code** — AWS CDK + CloudFormation + LocalStack for easy provisioning.

---

## 🛠️ Getting Started

### Prerequisites

- Java 17+
- Docker & Docker Compose
- Node.js (for frontend)
- Git

### Installation

```bash
git clone https://github.com/your-username/patient-management-system.git
cd patient-management-system
docker-compose up --build
```

---

## 💻 Usage

- Access the API via `http://localhost:8080`
- Frontend (optional): `http://localhost:3000`
- Swagger or Postman can be used to test endpoints.

---

## 🧪 Testing

```bash
./gradlew test
# or using Maven:
mvn test
```

---

## 📬 Contact

Made with ❤️ by [Karamveer Singh](https://github.com/Anurag0306)  
Feel free to reach out for collaboration or queries!

---

> ⚠️ **Note:** This project is for educational and demonstration purposes. Not intended for real-world medical deployment without proper compliance.

---

## 🔧 Microservices Breakdown

### 🏥 Patient Service
- Handles patient data management including CRUD operations.
- Implements data validation, DTO mapping, and exception handling.
- Communicates with the billing service via **gRPC** for decoupled and fast interaction.

### 💳 Billing Service
- Manages patient invoices, payment details, and billing summaries.
- Exposes **gRPC** endpoints defined via Protocol Buffers for high-performance data exchange.
- Communicates securely with patient-service using `billing-service.proto`.

### 📈 Analytics Service
- Processes billing and patient data for trend analysis and reports.
- Uses Kafka streams (or REST APIs) to receive and publish analytical insights.
- Aggregates usage metrics and generates structured responses for dashboards.

---

## ⚙️ gRPC Integration

- Uses **Protocol Buffers** to define the services (`billing-service.proto`).
- Enables efficient and low-latency communication between services (e.g., patient → billing).
- Spring Boot’s `@GrpcService` and `@GrpcClient` annotations are used to implement and call services.
- Reduces HTTP overhead and increases reliability for internal APIs.

---

## 🐳 Docker & Containerization

- Each microservice includes a **Dockerfile** to build minimal images for deployment.
- Uses `multi-stage builds` where needed to keep image sizes small and secure.
- Docker Compose (if used) allows spinning up the entire application stack locally with a single command.

---

## 📦 Folder Structure (High-Level)

```bash
patient-service/
│
├── controller/        # REST & gRPC controllers
├── dto/               # Data Transfer Objects
├── exception/         # Custom exceptions
├── grpc/              # gRPC clients & proto-generated files
├── model/             # Entity models
├── repository/        # Spring Data repositories
├── service/           # Business logic
└── Dockerfile         # Container config

billing-service/
├── controller/
├── service/
├── grpc/
├── proto/
└── Dockerfile

analytics-service/
├── controller/
├── service/
├── model/
└── Dockerfile
```

---

## 🔐 Security

- Each request is authenticated using **JWT tokens**.
- Tokens are issued on login and validated using `JwtUtils` and filter chains.
- Ensures only authorized access to sensitive patient/billing endpoints.

