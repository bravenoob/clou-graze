package com.bd.bern.clou.service;

import com.bd.bern.clou.domain.OpenSkyStates;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FlightStateService {
    private final Logger log = LoggerFactory.getLogger(FlightStateService.class);

    private GrazeKafkaProducer producer;

    public FlightStateService(GrazeKafkaProducer producer) {
        this.producer = producer;
    }

    @Scheduled(fixedRate = 15000, initialDelay = 20000)
    public void sendCurrentFlightStatesOverSwitzerland() {
        RestTemplate restTemplate = new RestTemplate();
        OpenSkyStates states = restTemplate.getForObject("https://opensky-network.org/api/states/all?lamin=45.8389&lomin=5.9962&lamax=47.8229&lomax=10.5226", OpenSkyStates.class);
        log.debug("states retrived {}", states);
        producer.sendFlightStates(states.getStates());
    }

}
