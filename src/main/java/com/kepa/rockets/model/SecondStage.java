
package com.kepa.rockets.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "engines",
    "fuel_amount_tons",
    "burn_time_sec",
    "thrust",
    "payloads"
})
public class SecondStage {

    @JsonProperty("engines")
    private Integer engines;
    @JsonProperty("fuel_amount_tons")
    private Integer fuelAmountTons;
    @JsonProperty("burn_time_sec")
    private Integer burnTimeSec;
    @JsonProperty("thrust")
    private Thrust thrust;
    @JsonProperty("payloads")
    private Payloads payloads;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("engines")
    public Integer getEngines() {
        return engines;
    }

    @JsonProperty("engines")
    public void setEngines(Integer engines) {
        this.engines = engines;
    }

    @JsonProperty("fuel_amount_tons")
    public Integer getFuelAmountTons() {
        return fuelAmountTons;
    }

    @JsonProperty("fuel_amount_tons")
    public void setFuelAmountTons(Integer fuelAmountTons) {
        this.fuelAmountTons = fuelAmountTons;
    }

    @JsonProperty("burn_time_sec")
    public Integer getBurnTimeSec() {
        return burnTimeSec;
    }

    @JsonProperty("burn_time_sec")
    public void setBurnTimeSec(Integer burnTimeSec) {
        this.burnTimeSec = burnTimeSec;
    }

    @JsonProperty("thrust")
    public Thrust getThrust() {
        return thrust;
    }

    @JsonProperty("thrust")
    public void setThrust(Thrust thrust) {
        this.thrust = thrust;
    }

    @JsonProperty("payloads")
    public Payloads getPayloads() {
        return payloads;
    }

    @JsonProperty("payloads")
    public void setPayloads(Payloads payloads) {
        this.payloads = payloads;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
