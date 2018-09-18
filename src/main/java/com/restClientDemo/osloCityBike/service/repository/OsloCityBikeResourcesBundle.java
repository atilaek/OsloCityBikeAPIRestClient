package com.restClientDemo.osloCityBike.service.repository;

import java.util.ResourceBundle;

/**
 * TODO
 *
 * @author Atila Ekimci
 */
public class OsloCityBikeResourcesBundle {
    private final static String BASE_URL = "base_URL";
    private final static String ApiKey_Prefix = "ApiKey_Prefix";
    private final static String ApiKey = "ApiKey";

    private static String bundleLocation = "static/cityBikeResources";
    private ResourceBundle resourceBundle;

    @SuppressWarnings("unused")
    public OsloCityBikeResourcesBundle() {
        resourceBundle = ResourceBundle.getBundle(bundleLocation);
    }

    public String getBaseUrl() {
        return resourceBundle.getString(BASE_URL);
    }

    public String getApiKey_Prefix() {
        return resourceBundle.getString(ApiKey_Prefix);
    }

    public String getApiKey() {
        return resourceBundle.getString(ApiKey);
    }
}
