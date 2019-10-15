package com.bd.bern.clou.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Collection;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenSkyStates {

    private int time;
    private Collection<FlightState> states;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Collection<FlightState> getStates() {
        if (states == null || states.isEmpty()) {
            return null;
        }
        return states;
    }

    public void setStates(Collection<FlightState> states) {
        this.states = states;
    }

    @Override
    public String toString() {
        return "OpenSkyStates{" +
            "time=" + time +
            ", flightStates=" + states +
            '}';
    }
}
