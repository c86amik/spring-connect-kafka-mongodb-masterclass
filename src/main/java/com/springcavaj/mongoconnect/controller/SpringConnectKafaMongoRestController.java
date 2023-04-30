package com.springcavaj.mongoconnect.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springcavaj.mongoconnect.model.UserModel;
import com.springcavaj.mongoconnect.service.SpringConnectKafkaMongoProducerService;

/**
 * @author springcavaj
 *
 */
@RestController
public class SpringConnectKafaMongoRestController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringConnectKafaMongoRestController.class);
	
	
	@Autowired
	private SpringConnectKafkaMongoProducerService connectKafkaMongoProducerService;
	  
	
	@PostMapping("/kafkaMongoJson")
	public UserModel kafkaMongoConnect(@RequestBody UserModel userModel) {
		String returnMsg = "Publish JSON User Model Message : " + userModel.toString();
		connectKafkaMongoProducerService.send(userModel);
		LOGGER.info(returnMsg);
		return userModel;
	}
	
	
}
