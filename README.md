# Spring Boot and React App
This project is a sample application that demonstrates how to build a web application using Spring Boot for the backend and React for the frontend. The backend is written in Java and uses Spring Boot to provide REST API functionality with a SQL database. The frontend is built using React and communicates with the backend via REST API calls.

## Prerequisites
To build and run this project, you will need:

Java 8 or later
Node.js 14.x or later
MySQL or H2 database (depending on the configuration you choose)
## Building and Running the Application
To build and run the application, follow these steps:

Clone the repository to your local machine.

```git clone https://github.com/Avinash014/hackathon.git```

Navigate to the project directory.

```cd hackathon```

(Optional) If you want to use the MySQL database, update the application.properties file to include your database settings. If you want to use the H2 database, no configuration changes are necessary.
Build the application using Gradle.

```./gradlew build```

Start the application.

```java -jar build/libs/hackathon-0.0.1-SNAPSHOT.jar```

or

```./gradlew bootRun```

In a separate terminal window, navigate to the frontend directory.

```cd frontend```

Install the frontend dependencies using npm.

```npm install```

Start the frontend server.

```npm start```


### Open your web browser and go to http://localhost:8080 to access the application.
#API Documentation
The application provides the following REST API endpoints:

1. GET /api/users - retrieves a list of all users in the database.

2. GET /api/users/{id} - retrieves a specific user by ID.(work in progress)
3. POST /api/users - creates a new user in the database.
4. PUT /api/users/{id} - updates an existing user in the database.(work in progress)
5. DELETE /api/users/{id} - deletes a user from the database.(work in progress)
# Contributing
If you would like to contribute to this project, please fork the repository and submit a pull request.

[Github](https://github.com/Avinash014/hackathon)
