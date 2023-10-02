package com.tholv.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
@RequiredArgsConstructor
public class KafkaController {
    private final KafkaProducerService kafkaProducerService;

    @RequestMapping(value = "/send",method = RequestMethod.POST)
    public String send(@RequestParam String message) {
        kafkaProducerService.sendMessage(message);
        return "Message sent to the Kafka Topic my-topic Successfully";
    }
}
