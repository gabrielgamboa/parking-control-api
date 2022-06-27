package com.example.parkingcontrol.services;

import com.example.parkingcontrol.models.UserModel;

import java.util.List;

public interface UserService {
    Object save(UserModel user);
    boolean existsByResponsibleName(String responsibleName);

    List<UserModel> findAll();
}
