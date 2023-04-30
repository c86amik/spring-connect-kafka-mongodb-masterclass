package com.springcavaj.mongoconnect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringConnectKafkaMongoApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringConnectKafkaMongoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringConnectKafkaMongoApplication.class, args);
		LOGGER.info("Spring Kafka Connect MongoDB Application Started");
	}
}