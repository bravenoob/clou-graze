package com.bd.bern.clou.service;

import com.bd.bern.clou.config.ApplicationProperties;
import com.bd.bern.clou.schema.Carbon;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Service
public class GrazeKafkaProducer {

    private static final Logger log = LoggerFactory.getLogger(GrazeKafkaProducer.class);

    private KafkaTemplate<String, Carbon> kafkaTemplate;
    private ApplicationProperties properties;

    public GrazeKafkaProducer(KafkaTemplate<String, Carbon> kafkaTemplate, ApplicationProperties properties) {
        this.kafkaTemplate = kafkaTemplate;
        this.properties = properties;
    }

    public void sendMessage(String message) {

        Carbon build = Carbon.newBuilder().setId(1).setFirstName(message).setLastName(message).build();
        log.info("Producing message to {} : {}", properties.getMovementTopic(), message);

        kafkaTemplate.send(properties.getMovementTopic(), build).addCallback(new ListenableFutureCallback<SendResult<String, Carbon>>() {
            @Override
            public void onFailure(Throwable ex) {
                log.error("Failed to send message {}", message);
            }

            @Override
            public void onSuccess(SendResult<String, Carbon> result) {
                log.debug("Message send sucessfull: {}", result);
            }
        });
    }
}
