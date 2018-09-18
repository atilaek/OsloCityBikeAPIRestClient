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
public class Station {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("in_service")
    @Expose
    private Boolean inService;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("subtitle")
    @Expose
    private String subtitle;
    @SerializedName("number_of_locks")
    @Expose
    private Integer numberOfLocks;
    @SerializedName("center")
    @Expose
    private Center center;
    @SerializedName("bounds")
    @Expose
    private List<Bound> bounds = null;
    @SerializedName("availability")
    @Expose
    private Availability availability;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getInService() {
        return inService;
    }

    public void setInService(Boolean inService) {
        this.inService = inService;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Integer getNumberOfLocks() {
        return numberOfLocks;
    }

    public void setNumberOfLocks(Integer numberOfLocks) {
        this.numberOfLocks = numberOfLocks;
    }

    public Center getCenter() {
        return center;
    }

    public void setCenter(Center center) {
        this.center = center;
    }

    public List<Bound> getBounds() {
        return bounds;
    }

    public void setBounds(List<Bound> bounds) {
        this.bounds = bounds;
    }

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        ToStringBuilder sb = new ToStringBuilder("");
        if (id != null) {
            sb.append("id", id).append("\n");
        }
        if (inService != null) {
            sb.append("inService", inService).append("\n");
        }
        if (title != null) {
            sb.append("title", title).append("\n");
        }
        if (subtitle != null) {
            sb.append("subtitle", subtitle).append("\n");
        }
        if (numberOfLocks != null) {
            sb.append("numberOfLocks", numberOfLocks).append("\n");
        }
        if (center != null) {
            sb.append("center", center).append("\n");
        }
        if (bounds != null) {
            sb.append("bounds", bounds).append("\n");
        }
        if (availability != null) {
            sb.append("availability", availability).append("\n");
        }
        return sb.toString();
    }

}
