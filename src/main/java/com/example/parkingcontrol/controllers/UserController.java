package com.example.parkingcontrol.controllers;

import com.example.parkingcontrol.dtos.UserDto;
import com.example.parkingcontrol.models.UserModel;
import com.example.parkingcontrol.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<Object> saveParkingSpot(@RequestBody @Valid UserDto userDto) {
        if (this.userService.existsByResponsibleName(userDto.responsibleName)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Responsible name already exists.");
        }

        UserModel user = new UserModel();
        user.setResponsibleName(userDto.responsibleName);
        System.out.println(user.toString());
        return ResponseEntity.status(HttpStatus.CREATED).body(this.userService.save(user));
    }

    @GetMapping
    public ResponseEntity<List<UserModel>> findAll() {
        List<UserModel> users = this.userService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(users);
    }
}
