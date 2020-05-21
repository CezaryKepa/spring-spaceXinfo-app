
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
    "number",
    "type",
    "version",
    "layout",
    "engine_loss_max",
    "propellant_1",
    "propellant_2",
    "thrust_sea_level",
    "thrust_vacuum",
    "thrust_to_weight"
})
public class Engines {

    @JsonProperty("number")
    private Integer number;
    @JsonProperty("type")
    private String type;
    @JsonProperty("version")
    private String version;
    @JsonProperty("layout")
    private String layout;
    @JsonProperty("engine_loss_max")
    private Integer engineLossMax;
    @JsonProperty("propellant_1")
    private String propellant1;
    @JsonProperty("propellant_2")
    private String propellant2;
    @JsonProperty("thrust_sea_level")
    private ThrustSeaLevel_ thrustSeaLevel;
    @JsonProperty("thrust_vacuum")
    private ThrustVacuum_ thrustVacuum;
    @JsonProperty("thrust_to_weight")
    private Double thrustToWeight;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("number")
    public Integer getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("layout")
    public String getLayout() {
        return layout;
    }

    @JsonProperty("layout")
    public void setLayout(String layout) {
        this.layout = layout;
    }

    @JsonProperty("engine_loss_max")
    public Integer getEngineLossMax() {
        return engineLossMax;
    }

    @JsonProperty("engine_loss_max")
    public void setEngineLossMax(Integer engineLossMax) {
        this.engineLossMax = engineLossMax;
    }

    @JsonProperty("propellant_1")
    public String getPropellant1() {
        return propellant1;
    }

    @JsonProperty("propellant_1")
    public void setPropellant1(String propellant1) {
        this.propellant1 = propellant1;
    }

    @JsonProperty("propellant_2")
    public String getPropellant2() {
        return propellant2;
    }

    @JsonProperty("propellant_2")
    public void setPropellant2(String propellant2) {
        this.propellant2 = propellant2;
    }

    @JsonProperty("thrust_sea_level")
    public ThrustSeaLevel_ getThrustSeaLevel() {
        return thrustSeaLevel;
    }

    @JsonProperty("thrust_sea_level")
    public void setThrustSeaLevel(ThrustSeaLevel_ thrustSeaLevel) {
        this.thrustSeaLevel = thrustSeaLevel;
    }

    @JsonProperty("thrust_vacuum")
    public ThrustVacuum_ getThrustVacuum() {
        return thrustVacuum;
    }

    @JsonProperty("thrust_vacuum")
    public void setThrustVacuum(ThrustVacuum_ thrustVacuum) {
        this.thrustVacuum = thrustVacuum;
    }

    @JsonProperty("thrust_to_weight")
    public Double getThrustToWeight() {
        return thrustToWeight;
    }

    @JsonProperty("thrust_to_weight")
    public void setThrustToWeight(Double thrustToWeight) {
        this.thrustToWeight = thrustToWeight;
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
