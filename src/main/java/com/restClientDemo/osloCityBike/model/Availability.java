package com.restClientDemo.osloCityBike.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Data POJO based on http://www.jsonschema2pojo.org
 *
 * @author Atila Ekimci
 */
public class Availability {

    @SerializedName("bikes")
    @Expose
    private Integer bikes;
    @SerializedName("locks")
    @Expose
    private Integer locks;

    public Integer getBikes() {
        return bikes;
    }

    public void setBikes(Integer bikes) {
        this.bikes = bikes;
    }

    public Integer getLocks() {
        return locks;
    }

    public void setLocks(Integer locks) {
        this.locks = locks;
    }

    @Override
    public String toString() {
        ToStringBuilder sb = new ToStringBuilder("");
        if(bikes != null){
            sb.append("bikes", bikes).append("\n");
        }
        if(locks != null){
            sb.append("locks", locks).append("\n");
        }
        return sb.toString();
    }

}
