package com.kepa.launches.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Payload {
    private String payload_id;
    private String nationality;
    private String manufacturer;
    private String payload_type;
    private String orbit;

    public String getPayload_id() {

        return payload_id;
    }

    public void setPayload_id(String payload_id) {
        this.payload_id = payload_id;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPayload_type() {
        return payload_type;
    }

    public void setPayload_type(String payload_type) {
        this.payload_type = payload_type;
    }

    public String getOrbit() {
        return orbit;
    }

    public void setOrbit(String orbit) {
        this.orbit = orbit;
    }
}
