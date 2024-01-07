# spring-connect-kafka-mongodb-masterclass

## A good understanding of the usage of Apache Kafka Connector (both source & sink) with Mongo using Spring BootApplication

### Software Required
* [Java 1.8](https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html)
* [Spring tool Suite](https://spring.io/tools) or [Eclipse](https://www.eclipse.org/downloads/packages/)
* [Apache Maven](https://maven.apache.org/download.cgi)
* [Git Bash](https://git-scm.com/downloads)
* [MongoDB](https://www.mongodb.com/try/download/community) - Download the Community Edition
* [Robo 3T](https://robomongo.org/download) - MongoDB Client. Download Robo 3T Only
* [Kafka](https://kafka.apache.org/downloads) - Download the Latest Version. Latest Version - <strong>Kafka 2.13</strong>
* [Kafka-Mongo Connector](https://www.mongodb.com/products/kafka-connector) - Download the Mongo-Kafka Conenctor
* [Postman](https://www.postman.com/downloads/)

### Install Kafka

#### Below Steps are for the Windows OS

<ol>
<li>Download the <strong>kafka_2.13-3.1.0.tgz</strong> file from the above url as mentioned in the Software Required Section</li>
<li>Unzip the file in a particular location</li>
<li>Let's say you have unzip Kafka in <strong>D:/Apache_Kafka</strong> folder, then go to that folder and open Command Prompt in every cases
<li>Open the Command Prompt (CMD) and <strong>Start the Zookeeper</strong></li>
<li> Command : <p>`.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties`</p></li>
<li>Open a new CMD and <strong>Start Apache Kafka Server</strong></li>
<li>Command : <p>`.\bin\windows\kafka-server-start.bat .\config\server.properties`</p></li>
<li>Open a new CMD and <strong>Create a Topic named `kafka-mongo-source-topic` that has 1 partition and 1 replica</strong></li>
<li>Command : <p>`.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic kafka-mongo-source-topic`</p></li>
<li>In the same CMD create another <strong>Topic named `kafka-mongo-sink-topic` that has 1 partition and 1 replica</strong></li>
<li>Command : <p>`.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic kafka-mongo-sink-topic`</p></li>
<li>Now create 2 topics as `kafka-mongo-source-topic` and `kafka-mongo-sink-topic`</li>
<li>Open a new CMD and <strong>Create the 1st Topic named `kafka-mongo-source-topic` that has 1 partition and 1 replica</strong></li>
<li>Command : <p>`.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic kafka-mongo-source-topic`</p></li>
<li>Open a new CMD and <strong>Create the 2nd Topic named `kafka-mongo-sink-topic` that has 1 partition and 1 replica</strong></li>
<li>Command : <p>`.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic kafka-mongo-sink-topic`</p></li>
</ol>
After doing all the above necessary steps if all things goes fine then you have successfully run Apache Kafka in your local machine

### Install Mongo-Kafka Connector

#### Below Steps are for the Windows OS

<ol>
<li>Download the <strong>mongodb-kafka-connect-mongodb-1.10.0.zip</strong> file from the above url as mentioned in the Software Required Section</li>
<li>Unzip the file in a particular location</li>
<li>Go inside there will be a directory named as <strong>config</strong></li>
<li>Here you have to put 2 .json files one is <strong>mongo_source.json</strong> and <strong>mongo_sink.json</strong></li>
<li>Both the files are attached in this project in the <strong>src/main/resource</strong> directory</li>
<li>If you want to use the Source Connector concept then write the below command</li>
<li>Let's say you have unzip Mongo-Kafka Connector in <strong>D:/mongodb-kafka-connect-mongodb-1.10.0</strong> folder, then go to that folder and open Command Prompt in every cases as discussed below</li>
<li>Open the Command Prompt (CMD) and <strong>Start the Mongo-Kafka Source Connector</strong></li>
<li>Command : <p>`.\bin\connect-standalone.bat .\config\connect-standalone.properties .\config\mongo-source.json`</p></li>
<li>If you want to use the Sink Connector concept then write the below command</li>
<li>Open the Command Prompt (CMD) and <strong>Start the Mongo-Kafka Sink Connector</strong></li>
<li>Command : <p>`.\bin\connect-standalone.bat .\config\connect-standalone.properties .\config\mongo-sink.json`</p></li>
</ol>
After doing all the above necessary steps if all things goes fine then you have successfully run Mongo-Kafka Connector in your local machine

### Steps to clone and run the application
* Install MongoDb
* After installing, set the Environment Variable <strong>MONGO_HOME</strong>
* To verify open Command Prompt and type <code>mongo -version</code>
* Type <code>mongod</code> in the open terminal. It will run the daemon process of Mongo
* Open Git Bash or even you can open Command Prompt (if you are using Windows) or Terminal (if you are using MAC) in your machine
* Clone the application from github.com as   
<code>git clone https://github.com/c86amik/spring-connect-kafka-mongodb-masterclass.git</code>
* Open either <strong>STS</strong> or <strong>Eclipse</strong> and import the application as <strong>Maven</strong> project
* After the application got successfully imported in either <strong>STS</strong> or <strong>Eclipse</strong>
* Start the ZooKeeper - <p>`.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties`</p>
* Start the Apache Kafka Server - <p>`.\bin\windows\kafka-server-start.bat .\config\server.properties`</p>
* If you want to run the Mongo-Kafka Source Connector, then start the Mongo-Kafka Source Connector using the `mongo_source.json` - <p>`.\bin\connect-standalone.bat .\config\connect-standalone.properties .\config\mongo-source.json`</p>
* Right Click on the application, select the <strong>Run As</strong> option, and then select <strong>Spring Boot App</strong>
* The application will start in the port <strong>7119</strong>
* Consumer will start consuming the messages from `kafka-mongo-source-topic` topic and log the message in the console
* If you want to run the Mongo-Kafka Sink Connector, then start the Mongo-Kafka Sink Connector using the `mongo_sink.json` - <p>`.\bin\connect-standalone.bat .\config\connect-standalone.properties .\config\mongo-sink.json`</p>
* Stop the before Mongo-Kafka Connector Source application
* Right Click on the application, select the <strong>Run As</strong> option, and then select <strong>Spring Boot App</strong>\
* The application will start again in the port <strong>7119</strong>
* For this testing you need Postman to be installed in your local machine
* Open the Postman and test the REST Endpoints

### Testing using Postman
<ol>
<li>Post the JSON data to <strong>kafka-mongo-sink-topic</strong> topic - localhost:7119/kafkaMongoJson</li>
</ol>

#### Dummy JSON object
* Body for the <strong>POST</strong> Method   
<code>{
	"firstName" : "First Name",
	"lastName" : "Last Name",
	"mobileNo" : "1234567890"
}</code>	