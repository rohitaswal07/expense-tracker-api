Smart Expense Tracker API

A RESTful API built using Spring Boot to manage personal expenses.

## Features

- Add a new expense
- View all expenses
- Filter expenses by category
- Calculate total expenses
- Calculate total expenses by category
- Delete an expense
- Input validation
- Global exception handling

## Tech Stack

- Java 17
- Spring Boot
- Maven
- Jakarta Validation

## Project Structure

```
src
├── controller
├── service
├── repository
├── model
├── exception
```

## Installation

Clone the repository

```bash
git clone <your-github-repository-url>
```

Move into the project

```bash
cd expense-tracker-api
```

## Run the application

```bash
mvn spring-boot:run
```

Application runs on

```
http://localhost:8080
```

## API Endpoints

### Add Expense

```
POST /expenses
```

### View All Expenses

```
GET /expenses
```

### Filter by Category

```
GET /expenses?category=Food
```

### Calculate Total Expenses

```
GET /expenses/total
```

### Calculate Total Expenses by Category

```
GET /expenses/total/Food
```

### Delete Expense

```
DELETE /expenses/{id}
```

## Run Tests

```bash
mvn test
```

## Notes

- Data is stored in memory using an ArrayList.
- No database is required as per assignment instructions.