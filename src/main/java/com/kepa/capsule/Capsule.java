package com.kepa.capsule;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.kepa.core.model.Mission;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Capsule {
    private String capsule_serial;
    private String capsule_id;
    private String status;
    private String original_launch;
    private List<Mission> missions;
    private int landings;
    private String type;
    private String details;
    private String reuse_count;

    public String getCapsule_serial() {
        return capsule_serial;
    }

    public void setCapsule_serial(String capsule_serial) {
        this.capsule_serial = capsule_serial;
    }

    public String getCapsule_id() {
        return capsule_id;
    }

    public void setCapsule_id(String capsule_id) {
        this.capsule_id = capsule_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOriginal_launch() {
        return original_launch;
    }

    public void setOriginal_launch(String original_launch) {
        this.original_launch = original_launch;
    }

    public List<Mission> getMissions() {
        return missions;
    }

    public void setMissions(List<Mission> missions) {
        this.missions = missions;
    }

    public int getLandings() {
        return landings;
    }

    public void setLandings(int landings) {
        this.landings = landings;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getReuse_count() {
        return reuse_count;
    }

    public void setReuse_count(String reuse_count) {
        this.reuse_count = reuse_count;
    }
}
