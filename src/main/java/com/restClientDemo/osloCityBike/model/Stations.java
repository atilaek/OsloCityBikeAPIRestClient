package com.restClientDemo.osloCityBike.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * Data POJO based on http://www.jsonschema2pojo.org
 *
 * @author Atila Ekimci
 */
public class Stations {

    @SerializedName("stations")
    @Expose
    private List<Station> stations = null;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("refresh_rate")
    @Expose
    private Float refreshRate;
    @SerializedName("status")
    @Expose
    private Status status;

    public List<Station> getStations() {
        return stations;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Float getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(Float refreshRate) {
        this.refreshRate = refreshRate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        ToStringBuilder sb = new ToStringBuilder("");
        if (stations != null) {
            sb.append("stations", stations).append("\n");
        }
        if (updatedAt != null) {
            sb.append("updatedAt", updatedAt).append("\n");
        }
        if (refreshRate != null) {
            sb.append("refreshRate", refreshRate).append("\n");
        }
        if (status != null) {
            sb.append("status", status).append("\n");
        }
        return sb.toString();
    }

}
