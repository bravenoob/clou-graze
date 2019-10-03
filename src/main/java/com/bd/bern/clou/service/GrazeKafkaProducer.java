package com.bd.bern.clou.service;

import com.bd.bern.clou.config.ApplicationProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Service
public class GrazeKafkaProducer {

    private static final Logger log = LoggerFactory.getLogger(GrazeKafkaProducer.class);

    private KafkaTemplate<String, String> kafkaTemplate;
    private ApplicationProperties properties;

    public GrazeKafkaProducer(KafkaTemplate<String, String> kafkaTemplate, ApplicationProperties properties) {
        this.kafkaTemplate = kafkaTemplate;
        this.properties = properties;
    }

    public void sendMessage(String message) {
        log.info("Producing message to {} : {}", properties.getMovementTopic(), message);
        kafkaTemplate.send(properties.getMovementTopic(), message).addCallback(new ListenableFutureCallback<SendResult<String, String>>() {
            @Override
            public void onFailure(Throwable ex) {
                log.warn("Failed to send message {}", message);
            }

            @Override
            public void onSuccess(SendResult<String, String> result) {
                log.debug("Message send sucessfull: {}", result);
            }
        });
    }
}
