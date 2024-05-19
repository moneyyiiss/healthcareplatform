# Healthcare Platform

## Description
This project is a backend system for a healthcare platform that connects doctors with patients. It allows users to search for doctors based on symptoms and location.

## Features
- Search doctors by symptoms and location.
- Manage patient and doctor information.
- Secure login and authentication for different roles (patient, doctor).

## Installation

### Prerequisites
- Java 17
- MySQL
- Maven

### Setting Up the Project
1. Clone the repository:
   ```bash
   git clone https://github.com/moneyyiiss/healthcareplatform

2. Navigate to the project directory:
   ```bash
   cd healthcareplatform

3. Install dependencies:
   ```bash
   mvn install

## Configuring the Database
### Ensure you have MySQL installed and running. Set up the database using the following commands:
     ```bash
     CREATE DATABASE healthcare;
     USE healthcare;
     -- Add database setup queries here

### Update the application.properties file with your database credentials:
    ```bash
    spring.datasource.url=jdbc:mysql://localhost:3306/healthcare
    spring.datasource.username=root
    spring.datasource.password=root

## Usage
### Run the application:
    ```base
    mvn spring-boot:run

## Documentation
    ```base
    http://localhost:8080/swagger-ui.html

## postman collection attached


   
