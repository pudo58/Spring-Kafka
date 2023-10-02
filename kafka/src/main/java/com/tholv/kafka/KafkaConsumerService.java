package com.tholv.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @Autowired
    private KafkaProducerService kafkaProducerService;
    @KafkaListener(topics = "my-topic", groupId = "my-group")
    public void listen(Object message) {
        // Xử lý thông điệp nhận được từ Kafka
        System.out.println("Received message: " + message);
    }
}