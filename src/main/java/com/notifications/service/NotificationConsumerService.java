package com.notifications.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumerService {
	
	@KafkaListener(topics = "${kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
	public void listenOrderCreation(ConsumerRecord<String, String> record) {
		System.out.println("Receiver End: " + record.value());
	}
}