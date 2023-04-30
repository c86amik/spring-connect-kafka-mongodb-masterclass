/**
 * 
 */
package com.springcavaj.mongoconnect.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.springcavaj.mongoconnect.model.UserModel;


/**
 * @author c86am
 *
 */
@Service
public class SpringConnectKafkaMongoProducerService {
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringConnectKafkaMongoProducerService.class);
	  
	@Autowired
	@Qualifier("kafkaJsonTemplate")
	private KafkaTemplate<String, UserModel> kafkaJsonTemplate;
	  
	private final static String APACHE_KAFKA_TOPIC_NAME = "kafka-mongo-topic";
	  
	public void send(UserModel userModel) {
		LOGGER.info("Data to be sent to Kafka-Mongo Topic - {}", userModel);
		kafkaJsonTemplate.send(APACHE_KAFKA_TOPIC_NAME, userModel); 
	}
}
