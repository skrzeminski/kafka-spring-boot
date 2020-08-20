package com.kafkatest.kafkademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "NewTopic";

    @Autowired
    public DemoController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @GetMapping("/publish/{message}")
    public String publishMessage(@PathVariable("message") final String message){
        kafkaTemplate.send(TOPIC, message);
        return "Published Successfully";
    }
}
