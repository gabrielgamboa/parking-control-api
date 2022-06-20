package com.example.parkingcontrol.services;

import com.example.parkingcontrol.models.ParkingSpotModel;
import com.example.parkingcontrol.repositories.ParkingSpotRepository;

import javax.transaction.Transactional;
import javax.validation.Valid;

public class ParkingSpotServiceImpl implements ParkingSpotService {

    private ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotServiceImpl(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }

    @Override
    @Transactional
    public ParkingSpotModel save(@Valid ParkingSpotModel parkingSpotModel) {
        return this.parkingSpotRepository.save(parkingSpotModel);
    }
}
