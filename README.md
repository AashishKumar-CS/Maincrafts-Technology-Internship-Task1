# Maincrafts-Technology-Internship-Task1

# ASHTECH Landing Page

A modern landing page for ASHTECH, a service-based software company, with a contact form connected to a Spring Boot backend.

## Project Structure
- `frontend/`: Contains `index.html` (HTML/CSS for the landing page).
- `backend/`: Spring Boot application with a controller to handle form submissions and MySQL integration.

## Features
- Stores contact form data (Name, Email, Message) in a MySQL database.
- Provides a `/contacts` endpoint to view all submissions in JSON.

## Setup
1. **Prerequisites**: Java 17, Maven, MySQL.
2. **Database**: Create `ashtech_db` in MySQL and update `application.properties` with credentials.
3. **Frontend**: Open `frontend/index.html` in a browser.
4. **Backend**: Navigate to `backend/` and run `mvn spring-boot:run`.

## Usage
- Submit the contact form to save data.
- Access `http://localhost:8080/contacts` with credentials to view stored data.

## License
MIT License