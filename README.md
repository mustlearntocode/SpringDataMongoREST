# SpringDataMongoREST
SpringDataREST using MongoDB

How to run?
1. run mongdb using mongod
2. install maven
3. use cd going into project folder and run mvn spring-boot:run
4. check result on http://localhost:8085/people


Don't forget that this project is using mongodb, you before you run maven, you need to open mongodb using command: mongod

Way to test:
type the following url into the address bar
1.Find people in Person class whose last name is Bauer
http://localhost:8085/people/search/findByLastName?name=Bauer
2.Find people in Person class whose first name is Jack
http://localhost:8085/people/search/findByFirstName?name=Jack


