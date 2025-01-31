package com.design.general.parkinglot;

public class Bus extends Vehicle {

    public Bus(){
        spotsNeeded = 5;
        size = VehicleSize.CarXUV;
    }
    @Override
    public boolean canFitinSpot(ParkingSpot spot) {
        return false;
    }
}
