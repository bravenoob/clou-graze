package com.bd.bern.clou.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class GrazeKafkaConsumer {

    private final Logger log = LoggerFactory.getLogger(GrazeKafkaConsumer.class);
    private static final String TOPIC = "topic_graze";

    @KafkaListener(topics = "topic_graze", groupId = "group_id")
    public void consume(String message) throws IOException {
        log.info("Consumed message in {} : {}", TOPIC, message);
    }
}
