
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
    "option_1",
    "option_2",
    "composite_fairing"
})
public class Payloads {

    @JsonProperty("option_1")
    private String option1;
    @JsonProperty("option_2")
    private String option2;
    @JsonProperty("composite_fairing")
    private CompositeFairing compositeFairing;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("option_1")
    public String getOption1() {
        return option1;
    }

    @JsonProperty("option_1")
    public void setOption1(String option1) {
        this.option1 = option1;
    }

    @JsonProperty("option_2")
    public String getOption2() {
        return option2;
    }

    @JsonProperty("option_2")
    public void setOption2(String option2) {
        this.option2 = option2;
    }

    @JsonProperty("composite_fairing")
    public CompositeFairing getCompositeFairing() {
        return compositeFairing;
    }

    @JsonProperty("composite_fairing")
    public void setCompositeFairing(CompositeFairing compositeFairing) {
        this.compositeFairing = compositeFairing;
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
