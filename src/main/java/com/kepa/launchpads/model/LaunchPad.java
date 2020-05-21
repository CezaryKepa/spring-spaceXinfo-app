
package com.kepa.launchpads.model;

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
    "status",
    "location",
    "vehicles_launched",
    "attempted_launches",
    "successful_launches",
    "wikipedia",
    "details",
    "site_id",
    "site_name_long"
})
public class LaunchPad {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("status")
    private String status;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("vehicles_launched")
    private List<String> vehiclesLaunched = null;
    @JsonProperty("attempted_launches")
    private Integer attemptedLaunches;
    @JsonProperty("successful_launches")
    private Integer successfulLaunches;
    @JsonProperty("wikipedia")
    private String wikipedia;
    @JsonProperty("details")
    private String details;
    @JsonProperty("site_id")
    private String siteId;
    @JsonProperty("site_name_long")
    private String siteNameLong;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("vehicles_launched")
    public List<String> getVehiclesLaunched() {
        return vehiclesLaunched;
    }

    @JsonProperty("vehicles_launched")
    public void setVehiclesLaunched(List<String> vehiclesLaunched) {
        this.vehiclesLaunched = vehiclesLaunched;
    }

    @JsonProperty("attempted_launches")
    public Integer getAttemptedLaunches() {
        return attemptedLaunches;
    }

    @JsonProperty("attempted_launches")
    public void setAttemptedLaunches(Integer attemptedLaunches) {
        this.attemptedLaunches = attemptedLaunches;
    }

    @JsonProperty("successful_launches")
    public Integer getSuccessfulLaunches() {
        return successfulLaunches;
    }

    @JsonProperty("successful_launches")
    public void setSuccessfulLaunches(Integer successfulLaunches) {
        this.successfulLaunches = successfulLaunches;
    }

    @JsonProperty("wikipedia")
    public String getWikipedia() {
        return wikipedia;
    }

    @JsonProperty("wikipedia")
    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }

    @JsonProperty("details")
    public String getDetails() {
        return details;
    }

    @JsonProperty("details")
    public void setDetails(String details) {
        this.details = details;
    }

    @JsonProperty("site_id")
    public String getSiteId() {
        return siteId;
    }

    @JsonProperty("site_id")
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    @JsonProperty("site_name_long")
    public String getSiteNameLong() {
        return siteNameLong;
    }

    @JsonProperty("site_name_long")
    public void setSiteNameLong(String siteNameLong) {
        this.siteNameLong = siteNameLong;
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
