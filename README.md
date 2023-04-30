# spring-data-mongo-masterclass

## A good understanding of the usage of spring-data with REST Service and using Mongo as local Database

### Software Required
* [Java 1.8](https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html)
* [Spring tool Suite](https://spring.io/tools) or [Eclipse](https://www.eclipse.org/downloads/packages/)
* [Apache Maven](https://maven.apache.org/download.cgi)
* [Git Bash](https://gramfile.com/git-bash-download/)
* [MongoDB](https://www.mongodb.com/try/download/community) - Download the Community Edition
* [Robo 3T](https://robomongo.org/download) - MongoDB Client. Download Robo 3T Only
* [Postman](https://www.postman.com/downloads/)


### Steps to clone and run the application
* Install MongoDb
* After installing, set the Environment Variable <strong>MONGO_HOME</strong>
* To verify open Command Prompt and type <code>mongo -version</code>
* Type <code>mongod</code> in the open terminal. It will run the daemon process of Mongo
* Open Git Bash or even you can open Command Prompt (if you are using Windows) or Terminal (if you are using MAC) in your machine
* Clone the application from github.com as   
<code>git clone https://github.com/c86amik/spring-data-mongo-masterclass.git</code>
* Open either <strong>STS</strong> or <strong>Eclipse</strong> and import the application as <strong>Maven</strong> project
* After the application got successfully imported in either <strong>STS</strong> or <strong>Eclipse</strong>
* Right Click on the application, select the <strong>Run As</strong> option, and then select <strong>Spring Boot App</strong>
* The application will start in the port <strong>7111</strong>
* Open the Postman and test the REST Endpoints

### Testing using Postman
<ol>
<li><strong>Get All Users</strong> - localhost:7111/allUsers</li>
<li><strong>Save an User</strong> - localhost:7111/saveUser</li>
<li><strong>Update an User</strong> - localhost:7111/updateUser/{id}. Here <strong>{id}</strong> is the id of the record stored in MongoDB</li>
<li><strong>Delete an User</strong> - localhost:7111/deleteUser/{id}</li>
<li><strong>Get user by firstName</strong> - localhost:7111/getUserByFirstName/{firstName}</li>
<li><strong>Get user by lastName</strong> - localhost:7111/getUserByLastName/{lastName}</li>
<li><strong>Get user by mobileNo</strong> - localhost:7111/getUserByMobileNo/{mobileNo}</li>
<li><strong>Get user by Email</strong> - localhost:7111/getUserByEmail/{email}</li>
<li><strong>Get user by panNo</strong> - localhost:7111/getUserByPan/{panNo}</li>
<li><strong>Get user by name</strong> - localhost:7111/getUserByName/{firstName}/{lastName}. Here <strong>name</strong> is the combination of <strong>firstName</strong> and <strong>lastName</strong></li>
</ol>

#### Dummy JSON object
* Body for the <strong>POST</strong> Method   
<code>{
	"firstName" : "First Name",
	"middleName" : "",
	"lastName" : "Last Name",
	"mobileNo" : "1234567890",
	"email" : "test@email.com",
	"panNo" : "ABCDE1234F"
}</code>
* Body for the <strong>PUT</strong> method
<code>{
	"id" : "6rt67erger45",
	"firstName" : "First Name",
	"middleName" : "",
	"lastName" : "Last Name",
	"mobileNo" : "1234567890",
	"email" : "test@email.com",
	"panNo" : "ABCDE1234F"
}</code>

	