package com.kepa.ships.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.kepa.core.model.Mission;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ship {
    private String ship_name;
    private String ship_type;
    private List<String> roles;
    private boolean active;
    private List<Mission> missions;
    private String url;
    private String image;

    public String getShip_name() {
        return ship_name;
    }

    public void setShip_name(String ship_name) {
        this.ship_name = ship_name;
    }

    public String getShip_type() {
        return ship_type;
    }

    public void setShip_type(String ship_type) {
        this.ship_type = ship_type;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<Mission> getMissions() {
        return missions;
    }

    public void setMissions(List<Mission> missions) {
        this.missions = missions;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
