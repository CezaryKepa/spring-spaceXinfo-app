package com.kepa.launches.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rocket {
    private String rocket_id;
    private String rocket_name;
    private second_stage second_stage;

    public com.kepa.launches.model.second_stage getSecond_stage() {
        return second_stage;
    }

    public void setSecond_stage(com.kepa.launches.model.second_stage second_stage) {
        this.second_stage = second_stage;
    }

    public String getRocket_id() {
        return rocket_id;
    }

    public void setRocket_id(String rocket_id) {
        this.rocket_id = rocket_id;
    }

    public String getRocket_name() {
        return rocket_name;
    }

    public void setRocket_name(String rocket_name) {
        this.rocket_name = rocket_name;
    }
}
