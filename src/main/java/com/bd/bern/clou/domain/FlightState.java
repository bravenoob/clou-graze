package com.bd.bern.clou.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonFormat(shape = JsonFormat.Shape.ARRAY)
public class FlightState {

    private String icao24;
    private String callsign;
    private String originCountry;
    private Double lastPositionUpdate;
    private Double lastContact;
    private Double longitude;
    private Double latitude;
    private Double geoAltitude;
    private boolean onGround;
    private Double velocity;
    private Double heading;
    private Double verticalRate;
    private Set sensors;
    private Double baroAltitude;
    private String squawk;
    private boolean spi;
    private PositionSource positionSource;


    public String getIcao24() {
        return icao24;
    }

    public void setIcao24(String icao24) {
        this.icao24 = icao24;
    }

    public String getCallsign() {
        return callsign;
    }

    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public Double getLastPositionUpdate() {
        return lastPositionUpdate;
    }

    public void setLastPositionUpdate(Double lastPositionUpdate) {
        this.lastPositionUpdate = lastPositionUpdate;
    }

    public Double getLastContact() {
        return lastContact;
    }

    public void setLastContact(Double lastContact) {
        this.lastContact = lastContact;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getGeoAltitude() {
        return geoAltitude;
    }

    public void setGeoAltitude(Double geoAltitude) {
        this.geoAltitude = geoAltitude;
    }

    public boolean isOnGround() {
        return onGround;
    }

    public void setOnGround(boolean onGround) {
        this.onGround = onGround;
    }

    public Double getVelocity() {
        return velocity;
    }

    public void setVelocity(Double velocity) {
        this.velocity = velocity;
    }

    public Double getHeading() {
        return heading;
    }

    public void setHeading(Double heading) {
        this.heading = heading;
    }

    public Double getVerticalRate() {
        return verticalRate;
    }

    public void setVerticalRate(Double verticalRate) {
        this.verticalRate = verticalRate;
    }

    public Set getSensors() {
        return sensors;
    }

    public void setSensors(Set sensors) {
        this.sensors = sensors;
    }

    public Double getBaroAltitude() {
        return baroAltitude;
    }

    public void setBaroAltitude(Double baroAltitude) {
        this.baroAltitude = baroAltitude;
    }

    public String getSquawk() {
        return squawk;
    }

    public void setSquawk(String squawk) {
        this.squawk = squawk;
    }

    public boolean isSpi() {
        return spi;
    }

    public void setSpi(boolean spi) {
        this.spi = spi;
    }

    public PositionSource getPositionSource() {
        return positionSource;
    }

    public void setPositionSource(PositionSource positionSource) {
        this.positionSource = positionSource;
    }

    @Override
    public String toString() {
        return "FlightState{" +
            "icao24='" + icao24 + '\'' +
            ", callsign='" + callsign + '\'' +
            ", originCountry='" + originCountry + '\'' +
            ", lastPositionUpdate=" + lastPositionUpdate +
            ", lastContact=" + lastContact +
            ", longitude=" + longitude +
            ", latitude=" + latitude +
            ", geoAltitude=" + geoAltitude +
            ", onGround=" + onGround +
            ", velocity=" + velocity +
            ", heading=" + heading +
            ", verticalRate=" + verticalRate +
            ", sensors=" + sensors +
            ", baroAltitude=" + baroAltitude +
            ", squawk='" + squawk + '\'' +
            ", spi=" + spi +
            ", positionSource=" + positionSource +
            '}';
    }

    enum PositionSource {
        ADS_B(0),
        ASTERIX(1),
        MLAT(2),
        FLARM(3),
        UNKNOWN(4);

        private final int number;

        PositionSource(final int number) {
            this.number = number;
        }

        @JsonValue
        int getNumber() {
            return this.number;
        }
    }


    public static final class FlightStateBuilder {
        private String icao24;
        private String callsign;
        private String originCountry;
        private Double lastPositionUpdate;
        private Double lastContact;
        private Double longitude;
        private Double latitude;
        private Double geoAltitude;
        private boolean onGround;
        private Double velocity;
        private Double heading;
        private Double verticalRate;
        private Set sensors;
        private Double baroAltitude;
        private String squawk;
        private boolean spi;
        private PositionSource positionSource;

        private FlightStateBuilder() {
        }

        public static FlightStateBuilder aFlightState() {
            return new FlightStateBuilder();
        }

        public FlightStateBuilder icao24(String icao24) {
            this.icao24 = icao24;
            return this;
        }

        public FlightStateBuilder callsign(String callsign) {
            this.callsign = callsign;
            return this;
        }

        public FlightStateBuilder originCountry(String originCountry) {
            this.originCountry = originCountry;
            return this;
        }

        public FlightStateBuilder lastPositionUpdate(Double lastPositionUpdate) {
            this.lastPositionUpdate = lastPositionUpdate;
            return this;
        }

        public FlightStateBuilder lastContact(Double lastContact) {
            this.lastContact = lastContact;
            return this;
        }

        public FlightStateBuilder longitude(Double longitude) {
            this.longitude = longitude;
            return this;
        }

        public FlightStateBuilder latitude(Double latitude) {
            this.latitude = latitude;
            return this;
        }

        public FlightStateBuilder geoAltitude(Double geoAltitude) {
            this.geoAltitude = geoAltitude;
            return this;
        }

        public FlightStateBuilder onGround(boolean onGround) {
            this.onGround = onGround;
            return this;
        }

        public FlightStateBuilder velocity(Double velocity) {
            this.velocity = velocity;
            return this;
        }

        public FlightStateBuilder heading(Double heading) {
            this.heading = heading;
            return this;
        }

        public FlightStateBuilder verticalRate(Double verticalRate) {
            this.verticalRate = verticalRate;
            return this;
        }

        public FlightStateBuilder sensors(Set sensors) {
            this.sensors = sensors;
            return this;
        }

        public FlightStateBuilder baroAltitude(Double baroAltitude) {
            this.baroAltitude = baroAltitude;
            return this;
        }

        public FlightStateBuilder squawk(String squawk) {
            this.squawk = squawk;
            return this;
        }

        public FlightStateBuilder spi(boolean spi) {
            this.spi = spi;
            return this;
        }

        public FlightStateBuilder positionSource(PositionSource positionSource) {
            this.positionSource = positionSource;
            return this;
        }

        public FlightState build() {
            FlightState flightState = new FlightState();
            flightState.setIcao24(icao24);
            flightState.setCallsign(callsign);
            flightState.setOriginCountry(originCountry);
            flightState.setLastPositionUpdate(lastPositionUpdate);
            flightState.setLastContact(lastContact);
            flightState.setLongitude(longitude);
            flightState.setLatitude(latitude);
            flightState.setGeoAltitude(geoAltitude);
            flightState.setOnGround(onGround);
            flightState.setVelocity(velocity);
            flightState.setHeading(heading);
            flightState.setVerticalRate(verticalRate);
            flightState.setSensors(sensors);
            flightState.setBaroAltitude(baroAltitude);
            flightState.setSquawk(squawk);
            flightState.setSpi(spi);
            flightState.setPositionSource(positionSource);
            return flightState;
        }
    }
}
