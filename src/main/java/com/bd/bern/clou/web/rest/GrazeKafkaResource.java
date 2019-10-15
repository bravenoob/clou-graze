package com.bd.bern.clou.web.rest;

import com.bd.bern.clou.domain.FlightState;
import com.bd.bern.clou.service.GrazeKafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/graze-kafka")
public class GrazeKafkaResource {

    private final Logger log = LoggerFactory.getLogger(GrazeKafkaResource.class);

    private GrazeKafkaProducer kafkaProducer;

    public GrazeKafkaResource(GrazeKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping(value = "/sendTestState")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        FlightState flightState = FlightState.FlightStateBuilder.aFlightState().icao24(message).velocity(100d)
            .verticalRate(0d).build();

        log.debug("REST request to send to Kafka topic the message : {}", message);
        this.kafkaProducer.sendFlightState(flightState);
    }
}
