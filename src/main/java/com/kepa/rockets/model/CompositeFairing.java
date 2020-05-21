
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
    "height",
    "diameter"
})
public class CompositeFairing {

    @JsonProperty("height")
    private Height_ height;
    @JsonProperty("diameter")
    private Diameter_ diameter;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("height")
    public Height_ getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Height_ height) {
        this.height = height;
    }

    @JsonProperty("diameter")
    public Diameter_ getDiameter() {
        return diameter;
    }

    @JsonProperty("diameter")
    public void setDiameter(Diameter_ diameter) {
        this.diameter = diameter;
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
