# Spring Boot
This project is a sample application that demonstrates how to build a web application using Spring Boot for the backend and React for the frontend. The backend is written in Java and uses Spring Boot to provide REST API functionality with a SQL database. 
The frontend is built by using React and communicates with the backend via REST API calls.
The 1st part(UI) of the project can be found [here](https://github.com/Avinash014/Aerothon-UI) 

## Prerequisites
To build and run this project, you will need:

Java 8 or later
MySQL or H2 database (depending on the configuration you choose)
## Building and Running the Application
To build and run the application, follow these steps:

Clone the repository to your local machine.

```git clone https://github.com/Avinash014/Aerothon-Backend.git```

Navigate to the project directory.

```cd Aerothon-Backend```

(Optional) If you want to use the MySQL database, update the application.properties file to include your database settings. If you want to use the H2 database, no configuration changes are necessary.
Build the application using Gradle.

```./gradlew build```

Start the application.


```./gradlew bootRun```


### Open your web browser and go to http://localhost:8080 to access the application.
#API Documentation
The application provides the following REST API endpoints:

1. GET /api/fabrications/ - retrieves List of fabrication Item

2. POST /api/fabrications/ - Insert fabrication Item(provide the appropriate api-body)

3. POST /api/fabrications/ - Insert fabrication Item(provide the appropriate api-body)

4. GET /api/users/ - retrieves a list of all users in the database.

5. POST /api/users - creates a new user in the database.

# Contributing
If you would like to contribute to this project, please fork the repository and submit a pull request.

[Github](https://github.com/Avinash014/Aerothon-Backend)
