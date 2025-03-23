package  com.project.springboot.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListner {

	@KafkaListener(topics = "DemoTopic", groupId = "demo-group")
	public void listenToDemoKafkaTopic(String messageReceived) {
		System.out.println("Message received is " + messageReceived);
	}
}
