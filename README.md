# Pet Store Api Automation Test 

Pet Store is a opensource API that performs requests to the database to get, add, 
update or delete records based on the request. In this project I just made post request and assertions
for specific endpoint on swagger document
: https://petstore.swagger.io/#/user/createUser

* Programming Language : Java
* Test Framework : JUnit 
* Build Tool : Maven 
* Payload created  with Pojo class 
* Response converted to JsonPath for make easier to check.

This test can be execute on terminal with: 

mvn test -Dtest=CreateUser



