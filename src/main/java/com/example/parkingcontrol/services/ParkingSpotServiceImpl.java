package com.example.parkingcontrol.services;

import com.example.parkingcontrol.models.ParkingSpotModel;
import com.example.parkingcontrol.repositories.ParkingSpotRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;

@Service
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

    public boolean existsByLicensePlateCar(String licensePlateCar) {
        return this.parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
    }

    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        return this.parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
    }

    public boolean existsByApartmentAndBlock(String apartment, String block) {
        return this.parkingSpotRepository.existsByApartmentAndBlock(apartment, block);
    }

    @Override
    public List<ParkingSpotModel> findAll() {
        return this.parkingSpotRepository.findAll();
    }
}
