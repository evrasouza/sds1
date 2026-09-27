# 📊 SDS1 - Full Stack Application

Full stack study project developed during **Semana DevSuperior 1.0**.

The project combines a **Spring Boot backend** with a **React + TypeScript frontend**, providing a practical example of a complete web application with REST APIs, persistence, validation, security, and frontend integration.

> ⚠️ **Project Status**
>
> This is an older study project and uses framework versions from the period when it was created.
>
> The repository is maintained as part of my technical learning history and portfolio.

## 🛠 Tech Stack

### Backend
- Java 11
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Validation
- Spring Security
- Maven
- H2 Database
- PostgreSQL

### Frontend
- React
- TypeScript
- React Scripts
- Jest
- React Testing Library

## 🎯 Project Purpose

The main goal of this project was to understand how a complete web application is structured and how frontend, backend, and database layers communicate.

Topics explored include:

- REST API development
- Spring Boot application architecture
- Database persistence with JPA
- Input validation
- Application security
- React components
- TypeScript
- Frontend/backend integration
- HTTP communication
- Automated frontend testing

## 📁 Project Structure

```text
sds1/
├── backend/
│   ├── src/
│   ├── create.sql
│   ├── pom.xml
│   ├── mvnw
│   └── mvnw.cmd
│
├── frontend-web/
│   ├── public/
│   ├── src/
│   ├── package.json
│   ├── tsconfig.json
│   └── yarn.lock
│
└── README.md
```

## ⚙️ Backend

The backend is implemented using Spring Boot and provides the application's REST services.

Main concepts include:

- REST endpoints
- JPA persistence
- Database integration
- Validation
- Security
- Development with H2
- PostgreSQL support

### Running the Backend

Navigate to:

```bash
cd backend
```

Linux/macOS:

```bash
./mvnw spring-boot:run
```

Windows:

```bash
mvnw.cmd spring-boot:run
```

## 🖥 Frontend

The web frontend was built with React and TypeScript.

Navigate to:

```bash
cd frontend-web
```

Install dependencies:

```bash
yarn install
```

Start the application:

```bash
yarn start
```

## 🧪 Frontend Tests

The frontend includes testing support using Jest and React Testing Library.

Run the tests with:

```bash
yarn test
```

## 🗄 Database

The backend supports:

- H2 Database
- PostgreSQL

The repository also contains a `create.sql` file with database initialization data.

## 🧠 What This Project Demonstrates

This project helped me understand the complete flow of a web application:

- React frontend
- REST API
- Spring Boot backend
- Data validation
- Security
- Database persistence
- Frontend/backend communication
- Automated frontend testing

From a QA perspective, understanding these layers helps when designing integration, API, and end-to-end test strategies.

## 📚 Learning Context

This repository was developed during **Semana DevSuperior 1.0**.

It represents part of my studies in full stack development and helped expand my understanding of how the systems being tested are implemented internally.

## 📌 Project Status

This is a **study and reference project**.

The framework and dependency versions reflect the period when the project was developed and may require updates to run in a modern environment.
