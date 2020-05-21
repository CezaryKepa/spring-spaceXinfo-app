package com.kepa.core.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Core {

    private String core_serial;

    private int block;

    private String status;

    private String original_launch;

    private Long original_launch_unix;

    private List<Mission> missions;

    private int reuse_count;

    private int rtls_attempts;

    private int rtls_landings;

    private int asds_attempts;

    private int asds_landings;

    private boolean water_landing;

    private String details;

    public String getCore_serial() {
        return core_serial;
    }

    public void setCore_serial(String core_serial) {
        this.core_serial = core_serial;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
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

    public Long getOriginal_launch_unix() {
        return original_launch_unix;
    }

    public void setOriginal_launch_unix(Long original_launch_unix) {
        this.original_launch_unix = original_launch_unix;
    }

    public List<Mission> getMissions() {
        return missions;
    }

    public void setMissions(List<Mission> missions) {
        this.missions = missions;
    }

    public int getReuse_count() {
        return reuse_count;
    }

    public void setReuse_count(int reuse_count) {
        this.reuse_count = reuse_count;
    }

    public int getRtls_attempts() {
        return rtls_attempts;
    }

    public void setRtls_attempts(int rtls_attempts) {
        this.rtls_attempts = rtls_attempts;
    }

    public int getRtls_landings() {
        return rtls_landings;
    }

    public void setRtls_landings(int rtls_landings) {
        this.rtls_landings = rtls_landings;
    }

    public int getAsds_attempts() {
        return asds_attempts;
    }

    public void setAsds_attempts(int asds_attempts) {
        this.asds_attempts = asds_attempts;
    }

    public int getAsds_landings() {
        return asds_landings;
    }

    public void setAsds_landings(int asds_landings) {
        this.asds_landings = asds_landings;
    }

    public boolean isWater_landing() {
        return water_landing;
    }

    public void setWater_landing(boolean water_landing) {
        this.water_landing = water_landing;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
