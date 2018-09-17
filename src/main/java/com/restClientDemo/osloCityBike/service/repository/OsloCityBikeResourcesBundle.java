package com.restClientDemo.osloCityBike.service.repository;

import java.util.ResourceBundle;

/**
 * TODO
 *
 * @author Atila Ekimci
 */
public class OsloCityBikeResourcesBundle {
    private final static String BASE_URL = "base_URL";
    private final static String ApiKey_Name = "ApiKey_name";
    private final static String ApiKey_Value = "ApiKey_value";

    private static String bundleLocation = "static/cityBikeResources";
    private ResourceBundle resourceBundle;

    @SuppressWarnings("unused")
    public OsloCityBikeResourcesBundle() {
        resourceBundle = ResourceBundle.getBundle(bundleLocation);
    }

    public String getBaseUrl() {
        return resourceBundle.getString(BASE_URL);
    }

    public String getApiKey_Name() {
        return resourceBundle.getString(ApiKey_Name);
    }

    public String getApiKey_Value() {
        return resourceBundle.getString(ApiKey_Value);
    }
}
