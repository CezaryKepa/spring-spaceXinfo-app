package com.kepa.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Mission {
    @JsonProperty("name")
    private String name;
    @JsonProperty("flight")
    private int flight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlight() {
        return flight;
    }

    public void setFlight(int flight) {
        this.flight = flight;
    }
}
