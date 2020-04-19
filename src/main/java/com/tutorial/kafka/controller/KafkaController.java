package com.tutorial.kafka.controller;

import com.tutorial.kafka.service.ProducerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    private final ProducerService producerService;

    public KafkaController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping("/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        producerService.sendMessage(message);
    }

}
