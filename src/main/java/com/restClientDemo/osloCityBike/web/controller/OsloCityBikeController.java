package com.restClientDemo.osloCityBike.web.controller;

import com.restClientDemo.osloCityBike.domain.Stations;
import com.restClientDemo.osloCityBike.domain.Availability;
import com.restClientDemo.osloCityBike.domain.Status;
import com.restClientDemo.osloCityBike.exception.ConnectionException;
import com.restClientDemo.osloCityBike.service.IOsloCityBikeService;
import com.restClientDemo.osloCityBike.service.OsloCityBikeServiceGenerator;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

/**
 * Returns {@link Stations}, {@link Availability}, {@link Status} reported by the Bysykkel API.
 */
public class OsloCityBikeController {

    private static IOsloCityBikeService service = OsloCityBikeServiceGenerator.createService(IOsloCityBikeService.class);

    public static Stations getAllStations() {
        Call<Stations> callSync = service.getAllStations();
        try {
            Response<Stations> response = callSync.execute();
            return response.body();
        } catch (IOException ex) {
            throw new ConnectionException("Could not execute service call");
        }
    }


    public static Stations getAvailability() {
        Call<Stations> callSync = service.getAvailability();
        try {
            Response<Stations> response = callSync.execute();
            return response.body();
        } catch (IOException ex) {
            throw new ConnectionException("Could not execute service call");
        }
    }

    public static Status getStatus() {
        Call<Status> callSync = service.getStatus();
        try {
            Response<Status> response = callSync.execute();
            return response.body();
        } catch (IOException ex) {
            throw new ConnectionException("Could not execute service call");
        }
    }
}
