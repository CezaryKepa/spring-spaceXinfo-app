
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
    "meters",
    "feet"
})
public class Height {

    @JsonProperty("meters")
    private Integer meters;
    @JsonProperty("feet")
    private Double feet;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("meters")
    public Integer getMeters() {
        return meters;
    }

    @JsonProperty("meters")
    public void setMeters(Integer meters) {
        this.meters = meters;
    }

    @JsonProperty("feet")
    public Double getFeet() {
        return feet;
    }

    @JsonProperty("feet")
    public void setFeet(Double feet) {
        this.feet = feet;
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
