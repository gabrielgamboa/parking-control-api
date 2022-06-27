package com.example.parkingcontrol.services;

import com.example.parkingcontrol.models.ParkingSpotModel;
import com.example.parkingcontrol.models.UserModel;
import com.example.parkingcontrol.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserModel save(UserModel user) {
        return this.userRepository.save(user);
    }

    @Override
    public boolean existsByResponsibleName(String responsibleName) {
        return this.userRepository.existsByResponsibleName(responsibleName);
    }

    @Override
    public List<UserModel> findAll() {
        return this.userRepository.findAll();
    }
}
