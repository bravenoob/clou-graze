package com.bd.bern.clou.service;

import com.bd.bern.clou.config.ApplicationProperties;
import com.bd.bern.clou.domain.FlightState;
import com.bd.bern.clou.schema.Flight;
import org.apache.kafka.common.serialization.Serdes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFutureCallback;

import java.util.Collection;

@Service
public class GrazeKafkaProducer {

    private static final Logger log = LoggerFactory.getLogger(GrazeKafkaProducer.class);

    private KafkaTemplate<String, Flight> kafkaTemplate;
    private ApplicationProperties properties;
    private String key = "flight";

    public GrazeKafkaProducer(KafkaTemplate<String, Flight> kafkaTemplate, ApplicationProperties properties) {
        this.kafkaTemplate = kafkaTemplate;
        this.properties = properties;
    }

    public void sendFlightStates(Collection<FlightState> states) {
        for (FlightState state : states) {
            sendFlightState(state);
        }
    }

    public void sendFlightState(FlightState flightState) {
        Flight flight = Flight.newBuilder().setIcao24(flightState.getIcao24()).setVelocity(flightState.getVelocity())
            .setVerticalRate(flightState.getVerticalRate()).build();
        log.info("Producing message to {} : {}", properties.getMovementTopic(), flight);
        kafkaTemplate.send(properties.getMovementTopic(), key, flight).addCallback(new ListenableFutureCallback<SendResult<String, Flight>>() {
            @Override
            public void onFailure(Throwable ex) {
                log.error("Failed to send message {}", flight);
            }

            @Override
            public void onSuccess(SendResult<String, Flight> result) {
                log.debug("Message send sucessfull: {}", result);
            }
        });
    }
}
