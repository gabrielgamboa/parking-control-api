package com.example.parkingcontrol.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "tb_user")
public class UserModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 130)
    private String responsibleName;

    @OneToOne(mappedBy = "user")
    private ParkingSpotModel parkingSpot;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public ParkingSpotModel getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpotModel parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
