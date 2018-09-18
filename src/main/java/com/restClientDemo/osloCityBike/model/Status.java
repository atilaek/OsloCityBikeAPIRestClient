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
public class Status {

    @SerializedName("all_stations_closed")
    @Expose
    private Boolean allStationsClosed;
    @SerializedName("stations_closed")
    @Expose
    private List<Object> stationsClosed = null;

    public Boolean getAllStationsClosed() {
        return allStationsClosed;
    }

    public void setAllStationsClosed(Boolean allStationsClosed) {
        this.allStationsClosed = allStationsClosed;
    }

    public List<Object> getStationsClosed() {
        return stationsClosed;
    }

    public void setStationsClosed(List<Object> stationsClosed) {
        this.stationsClosed = stationsClosed;
    }

    @Override
    public String toString() {
        ToStringBuilder sb = new ToStringBuilder("");
        if (allStationsClosed != null) {
            sb.append("allStationsClosed", allStationsClosed).append("\n");
        }
        if (stationsClosed != null) {
            sb.append("stationsClosed", stationsClosed).append("\n");
        }
        return sb.toString();
    }

}
