
package com.kepa.rockets.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "active",
    "stages",
    "boosters",
    "cost_per_launch",
    "success_rate_pct",
    "first_flight",
    "country",
    "company",
    "height",
    "diameter",
    "mass",
    "payload_weights",
    "first_stage",
    "second_stage",
    "engines",
    "landing_legs",
    "wikipedia",
    "description",
    "rocket_id",
    "rocket_name",
    "rocket_type"
})
public class Rocket {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("stages")
    private Integer stages;
    @JsonProperty("boosters")
    private Integer boosters;
    @JsonProperty("cost_per_launch")
    private Integer costPerLaunch;
    @JsonProperty("success_rate_pct")
    private Integer successRatePct;
    @JsonProperty("first_flight")
    private String firstFlight;
    @JsonProperty("country")
    private String country;
    @JsonProperty("company")
    private String company;
    @JsonProperty("height")
    private Height height;
    @JsonProperty("diameter")
    private Diameter diameter;
    @JsonProperty("mass")
    private Mass mass;
    @JsonProperty("payload_weights")
    private List<PayloadWeight> payloadWeights = null;
    @JsonProperty("first_stage")
    private FirstStage firstStage;
    @JsonProperty("second_stage")
    private SecondStage secondStage;
    @JsonProperty("engines")
    private Engines engines;
    @JsonProperty("landing_legs")
    private LandingLegs landingLegs;
    @JsonProperty("wikipedia")
    private String wikipedia;
    @JsonProperty("description")
    private String description;
    @JsonProperty("rocket_id")
    private String rocketId;
    @JsonProperty("rocket_name")
    private String rocketName;
    @JsonProperty("rocket_type")
    private String rocketType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonIgnore
    private String imgUrl;

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("stages")
    public Integer getStages() {
        return stages;
    }

    @JsonProperty("stages")
    public void setStages(Integer stages) {
        this.stages = stages;
    }

    @JsonProperty("boosters")
    public Integer getBoosters() {
        return boosters;
    }

    @JsonProperty("boosters")
    public void setBoosters(Integer boosters) {
        this.boosters = boosters;
    }

    @JsonProperty("cost_per_launch")
    public Integer getCostPerLaunch() {
        return costPerLaunch;
    }

    @JsonProperty("cost_per_launch")
    public void setCostPerLaunch(Integer costPerLaunch) {
        this.costPerLaunch = costPerLaunch;
    }

    @JsonProperty("success_rate_pct")
    public Integer getSuccessRatePct() {
        return successRatePct;
    }

    @JsonProperty("success_rate_pct")
    public void setSuccessRatePct(Integer successRatePct) {
        this.successRatePct = successRatePct;
    }

    @JsonProperty("first_flight")
    public String getFirstFlight() {
        return firstFlight;
    }

    @JsonProperty("first_flight")
    public void setFirstFlight(String firstFlight) {
        this.firstFlight = firstFlight;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("company")
    public String getCompany() {
        return company;
    }

    @JsonProperty("company")
    public void setCompany(String company) {
        this.company = company;
    }

    @JsonProperty("height")
    public Height getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Height height) {
        this.height = height;
    }

    @JsonProperty("diameter")
    public Diameter getDiameter() {
        return diameter;
    }

    @JsonProperty("diameter")
    public void setDiameter(Diameter diameter) {
        this.diameter = diameter;
    }

    @JsonProperty("mass")
    public Mass getMass() {
        return mass;
    }

    @JsonProperty("mass")
    public void setMass(Mass mass) {
        this.mass = mass;
    }

    @JsonProperty("payload_weights")
    public List<PayloadWeight> getPayloadWeights() {
        return payloadWeights;
    }

    @JsonProperty("payload_weights")
    public void setPayloadWeights(List<PayloadWeight> payloadWeights) {
        this.payloadWeights = payloadWeights;
    }

    @JsonProperty("first_stage")
    public FirstStage getFirstStage() {
        return firstStage;
    }

    @JsonProperty("first_stage")
    public void setFirstStage(FirstStage firstStage) {
        this.firstStage = firstStage;
    }

    @JsonProperty("second_stage")
    public SecondStage getSecondStage() {
        return secondStage;
    }

    @JsonProperty("second_stage")
    public void setSecondStage(SecondStage secondStage) {
        this.secondStage = secondStage;
    }

    @JsonProperty("engines")
    public Engines getEngines() {
        return engines;
    }

    @JsonProperty("engines")
    public void setEngines(Engines engines) {
        this.engines = engines;
    }

    @JsonProperty("landing_legs")
    public LandingLegs getLandingLegs() {
        return landingLegs;
    }

    @JsonProperty("landing_legs")
    public void setLandingLegs(LandingLegs landingLegs) {
        this.landingLegs = landingLegs;
    }

    @JsonProperty("wikipedia")
    public String getWikipedia() {
        return wikipedia;
    }

    @JsonProperty("wikipedia")
    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("rocket_id")
    public String getRocketId() {
        return rocketId;
    }

    @JsonProperty("rocket_id")
    public void setRocketId(String rocketId) {
        this.rocketId = rocketId;
    }

    @JsonProperty("rocket_name")
    public String getRocketName() {
        return rocketName;
    }

    @JsonProperty("rocket_name")
    public void setRocketName(String rocketName) {
        this.rocketName = rocketName;
    }

    @JsonProperty("rocket_type")
    public String getRocketType() {
        return rocketType;
    }

    @JsonProperty("rocket_type")
    public void setRocketType(String rocketType) {
        this.rocketType = rocketType;
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
