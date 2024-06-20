Semester4-MidtermSprint-Server
---
# Event Management System - Server

This project is a Java-based server application that provides a RESTful API for managing events, attendees, speakers, and venues. The server allows clients to perform various operations such as creating, updating, and deleting these entities, as well as retrieving information about them.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Features](#features)
- [Contributing](#contributing)
- [License](#license)

## Installation

1. **Clone the repository:**

    ```sh
    git clone https://github.com/yourusername/event-management-server.git
    cd event-management-server
    ```

2. **Build the project:**

    ```sh
    ./mvnw clean install
    ```

3. **Run the application:**

    ```sh
    ./mvnw spring-boot:run
    ```

## Usage

The server application provides a RESTful API that can be accessed via HTTP requests. You can use tools like Postman or curl to interact with the API.

### Example Requests

1. **Get all attendees:**

    ```sh
    curl -X GET http://localhost:8080/attendees
    ```

2. **Get an attendee by ID:**

    ```sh
    curl -X GET http://localhost:8080/attendee/1
    ```

3. **Create a new attendee:**

    ```sh
    curl -X POST http://localhost:8080/attendee -H "Content-Type: application/json" -d '{"id":1,"firstName":"John","lastName":"Doe","email":"john.doe@example.com"}'
    ```

4. **Update an attendee:**

    ```sh
    curl -X PUT http://localhost:8080/attendee/1 -H "Content-Type: application/json" -d '{"firstName":"Jane","lastName":"Doe","email":"jane.doe@example.com"}'
    ```

5. **Delete an attendee:**

    ```sh
    curl -X DELETE http://localhost:8080/attendee/1
    ```

## API Endpoints

### Attendee Endpoints

- **GET /attendees**: Retrieve all attendees.
- **GET /attendee/{id}**: Retrieve an attendee by ID.
- **POST /attendee**: Create a new attendee.
- **PUT /attendee/{id}**: Update an existing attendee.
- **DELETE /attendee/{id}**: Delete an attendee by ID.
- **GET /search_attendee**: Search attendees by last name and email.

### Event Endpoints

- **GET /events**: Retrieve all events.
- **GET /event/{id}**: Retrieve an event by ID.
- **POST /event**: Create a new event.
- **PUT /event/{id}**: Update an existing event.
- **DELETE /event/{id}**: Delete an event by ID.
- **POST /event/{id}/attendees**: Add attendees to an event.

### Speaker Endpoints

- **GET /speakers**: Retrieve all speakers.
- **GET /speaker/{id}**: Retrieve a speaker by ID.
- **POST /speaker**: Create a new speaker.
- **PUT /speaker/{id}**: Update an existing speaker.
- **DELETE /speaker/{id}**: Delete a speaker by ID.

### Venue Endpoints

- **GET /venues**: Retrieve all venues.
- **GET /venue/{id}**: Retrieve a venue by ID.
- **POST /venue**: Create a new venue.
- **PUT /venue/{id}**: Update an existing venue.
- **DELETE /venue/{id}**: Delete a venue by ID.
- **GET /search_venue**: Search venues by name and location.

## Features

- **Attendee Management:**
  - Create, update, delete, and retrieve attendees.
  - Search attendees by last name and email.

- **Event Management:**
  - Create, update, delete, and retrieve events.
  - Add attendees to events.

- **Speaker Management:**
  - Create, update, delete, and retrieve speakers.

- **Venue Management:**
  - Create, update, delete, and retrieve venues.
  - Search venues by name and location.

## Contributing

1. **Fork the repository.**

2. **Create a new branch:**

    ```sh
    git checkout -b feature-branch
    ```

3. **Make your changes and commit them:**

    ```sh
    git commit -m 'Add some feature'
    ```

4. **Push to the branch:**

    ```sh
    git push origin feature-branch
    ```

5. **Create a pull request.**

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

**Note:** This project is part of a sprint week assignment. The client-side implementation is required to interact with this server. Ensure the client is configured to connect to `http://localhost:8080` before using the client application.
