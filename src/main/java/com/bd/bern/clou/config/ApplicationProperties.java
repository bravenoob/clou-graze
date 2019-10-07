package com.bd.bern.clou.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to Graze.
 * <p>
 * Properties are configured in the {@code application.yml} file.
 * See {@link io.github.jhipster.config.JHipsterProperties} for a good example.
 */
@ConfigurationProperties(prefix = "clou", ignoreUnknownFields = false)
public class ApplicationProperties {

    String movementTopic;

    public String getMovementTopic() {
        return movementTopic;
    }

    public void setMovementTopic(String movementTopic) {
        this.movementTopic = movementTopic;
    }
}
