/**
 * 
 */
package com.springcavaj.mongoconnect.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.springcavaj.mongoconnect.model.UserModel;


/**
 * @author c86am
 *
 */
@Service
public class SpringConnectKafkaMongoConsumerService {
	
private static final Logger LOGGER = LoggerFactory.getLogger(SpringConnectKafkaMongoConsumerService.class);
	
	@KafkaListener(topics = "kafka-mongo-topic", groupId = "mongo_connect",
			containerFactory = "kafkaListenerContainerFactory")
	public void consumeData(UserModel userModel) {
		LOGGER.info("Consume Message from Kafka-Mongo Topic is : {}", userModel.toString());
	}

}
