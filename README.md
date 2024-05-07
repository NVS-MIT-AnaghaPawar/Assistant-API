# Hirademy-Assistant-API
This is simple springboot application with CRUD APIs for managing assistants using JAVA and MySql.

## Prerequisites

Before running the application, make sure you have the following installed:
- Java JDK 8 or higher
- Maven
- MySQL
- Postman

## Dependencies

- Spring web
- My sql driver
- Spring data jpa
- Spring boot devtools

## Setup
1. Clone the repository:
git clone https://github.com/NVS-MIT-AnaghaPawar/Hirademy-Assistant-API.git

2. Navigate to the project directory:
cd Hirademy-Assistant-API

3. Update the application properties:
Open src/main/resources/application.properties.
Update the database connection properties according to your MySQL setup.

4. Build the project:
mvn clean install

5. Run the application:
java -jar target/Hirademy-Assistant-API-0.0.1-SNAPSHOT.jar
The application should now be running on http://localhost:8082.

## API Endpoints

The application uses the following API endpoints:

- 'POST /assistant': Creates a new record in the database and returns the id of the assistant.
- 'GET /assistant/<assistant_id>': Retrieves the details of the assistant with the specified id.
- 'PUT /assistant/<assistant_id>': Updates the details of the assistant with the specified id.
- 'DELETE /assistant/<assistant_id>': Deletes the record of the assistant with the specified id.

 ## Contributing

If you'd like to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and commit them.
4. Push your changes to your forked repository.
5. Submit a pull request to the main repository.

## Contributor 
Anagha Pawar

Here is a working Demo:
![post](https://github.com/NVS-MIT-AnaghaPawar/Hirademy-Assistant-API/assets/120309587/dec7005d-18d0-4a5f-a9b0-c3f0e0e2c63f)
![db](https://github.com/NVS-MIT-AnaghaPawar/Hirademy-Assistant-API/assets/120309587/bb237549-9a11-48e1-9b11-359100fc3512)


