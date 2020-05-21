
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
    "reusable",
    "engines",
    "fuel_amount_tons",
    "burn_time_sec",
    "thrust_sea_level",
    "thrust_vacuum"
})
public class FirstStage {

    @JsonProperty("reusable")
    private Boolean reusable;
    @JsonProperty("engines")
    private Integer engines;
    @JsonProperty("fuel_amount_tons")
    private Integer fuelAmountTons;
    @JsonProperty("burn_time_sec")
    private Integer burnTimeSec;
    @JsonProperty("thrust_sea_level")
    private ThrustSeaLevel thrustSeaLevel;
    @JsonProperty("thrust_vacuum")
    private ThrustVacuum thrustVacuum;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("reusable")
    public Boolean getReusable() {
        return reusable;
    }

    @JsonProperty("reusable")
    public void setReusable(Boolean reusable) {
        this.reusable = reusable;
    }

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

    @JsonProperty("thrust_sea_level")
    public ThrustSeaLevel getThrustSeaLevel() {
        return thrustSeaLevel;
    }

    @JsonProperty("thrust_sea_level")
    public void setThrustSeaLevel(ThrustSeaLevel thrustSeaLevel) {
        this.thrustSeaLevel = thrustSeaLevel;
    }

    @JsonProperty("thrust_vacuum")
    public ThrustVacuum getThrustVacuum() {
        return thrustVacuum;
    }

    @JsonProperty("thrust_vacuum")
    public void setThrustVacuum(ThrustVacuum thrustVacuum) {
        this.thrustVacuum = thrustVacuum;
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
