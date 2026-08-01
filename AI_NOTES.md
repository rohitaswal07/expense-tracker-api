AI Usage Notes

## AI-generated vs. self-written

I used ChatGPT as a development assistant throughout this assignment for guidance, learning, and code review. AI was mainly used for:

* Initial project planning
* REST API endpoint design
* Code structure and architecture suggestions
* Explaining Spring Boot concepts
* README.md suggestions

The following parts were implemented primarily by me:

* Controllers
* Service layer implementation
* Repository implementation
* Validation using Jakarta Validation
* Global exception handling
* Project integration and debugging
* Basic test setup

## What I validated, tested, or changed

I manually tested all API endpoints using Postman and verified that they worked as expected. During development, I made several improvements based on testing and code review, including:

* Replaced `double` with `BigDecimal` for accurate monetary calculations.
* Added validation annotations and custom validation messages.
* Improved error handling using a global exception handler and a custom exception.
* Simplified and refined the REST endpoint structure.
* Fixed request mapping and controller issues discovered during testing.

## AI suggestions not used

One suggestion was to store expense data in a JSON file. I decided not to use that approach because the assignment explicitly allows in-memory storage, and using an `ArrayList` kept the solution simpler while fully satisfying the requirements.

I also chose not to introduce DTOs or a database to keep the project focused on the assignment scope and deadline.

This version is honest, matches the work you actually did, and aligns well with what the assignment asks for.