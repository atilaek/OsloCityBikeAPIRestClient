package com.restClientDemo.osloCityBike;

import com.restClientDemo.osloCityBike.web.controller.OsloCityBikeController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class OsloCityBikeApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(OsloCityBikeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Printing All Stations");
        System.out.println(OsloCityBikeController.getAllStations());

        System.out.println("Printing Availability");
        System.out.println(OsloCityBikeController.getAvailability());

        System.out.println("Printing Status");
        System.out.println(OsloCityBikeController.getStatus());
    }
}
