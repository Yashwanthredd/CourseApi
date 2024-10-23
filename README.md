This project is a simple RESTful API for managing a list of courses, providing basic CRUD (Create, Read, Update, Delete) operations. The API allows for adding courses, retrieving all courses, updating a course by ID, and deleting a course by ID, using a simple JSON format to store course data such as title, description, and duration.

Technology Stack
Backend Language: Used Spring Boot RestAPI framework 
Database:Used MS SQL SERVER
JSON Format: Course data is transferred and managed using JSON.
Features
Add a Course: Create a new course by sending a POST request with the course details (title, description, duration).
Retrieve All Courses: Retrieve a list of all available courses.
Update a Course by ID: Modify the details of an existing course by providing its unique ID.
Delete a Course by ID: Remove a course from the system using its unique ID.
Endpoints
Here are the REST API endpoints available in the application:

HTTP Method	Endpoint	Description
POST	/api/courses	Add a new course
GET	/api/courses	Retrieve all courses
PUT	/api/courses/:id	Update course by ID
DELETE	/api/courses/:id	Delete course by ID
