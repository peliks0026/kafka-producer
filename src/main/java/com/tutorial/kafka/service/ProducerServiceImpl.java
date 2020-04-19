package com.tutorial.kafka.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProducerServiceImpl implements ProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void sendMessage(String message) {
        log.info(String.format("Producing message -> %s", message));
        kafkaTemplate.sendDefault(message);
    }

}
