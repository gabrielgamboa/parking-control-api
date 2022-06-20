package com.example.parkingcontrol.services;

import com.example.parkingcontrol.models.ParkingSpotModel;

import java.util.List;

public interface ParkingSpotService {
    Object save(ParkingSpotModel parkingSpotModel);

    boolean existsByLicensePlateCar(String licensePlateCar);

    boolean existsByParkingSpotNumber(String parkingSpotNumber);

    boolean existsByApartmentAndBlock(String apartment, String block);

    List<ParkingSpotModel> findAll();
}
