# letslearn-rest-server
This is an Springboot Java application to learn how to build REST api server in Java

### Building docker image of this project
docker build . -t letslearn-rest-server

### Running docker image of this project
docker run -p 8081:8080 letslearn-rest-server

### Browsing GraphQL Server
http://localhost:8081/api

### Sample APIs
http://localhost:8080/api/getAuthors

http://localhost:8080/api/getAuthorByBookId?bookId=book-3

http://localhost:8080/api/getBooks
