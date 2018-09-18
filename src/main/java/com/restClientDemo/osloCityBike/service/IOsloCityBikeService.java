package com.restClientDemo.osloCityBike.service;

import com.restClientDemo.osloCityBike.model.Stations;
import com.restClientDemo.osloCityBike.model.Status;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Interacts with the API provided by Oslo Bysykkel.
 */
public interface IOsloCityBikeService {
    @GET("api/v1/stations.json")
    Call<Stations> getAllStations();

    @GET("api/v1/stations/availability.json")
    Call<Stations> getAvailability();

    @GET("api/v1/status.json")
    Call<Status> getStatus();
}
