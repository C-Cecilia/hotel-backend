# hotel-backend
This is the backend part of the hotel API building project.
To run it in your local environment, you need to have Java 17 installed and Maven configured. Then, you can build the project using the following command:
```
mvn clean install
```
After building the project, you can run the application using the following command:
```
mvn spring-boot:run
```
Once the application is running, you can access the API endpoints using the following URLs:

```
GET /api/hotels - Retrieve all hotels (ex: http://localhost:8080/api/hotels)
GET /api/hotels/{id} - Retrieve a hotel by its ID (ex: http://localhost:8080/api/hotels/1)
```


If it is not running, check the following steps:
1. Check if the Java version is 17. ( java -version)
2. Check if Maven is installed and configured correctly. (mvn -v)
3. Check if the project is built successfully. (mvn clean install)
4. Check if you are in the corrrect directory. (ls to check if the current directory have mvn)
(if not, cd hotel-backend to the directory that have the mvn)
