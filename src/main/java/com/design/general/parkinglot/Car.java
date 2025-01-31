package com.design.general.parkinglot;

public class Car extends Vehicle{
    public Car(){
        spotsNeeded = 1;
        size = VehicleSize.CarCompact;
    }
    @Override
    public boolean canFitinSpot(ParkingSpot spot) {
        return false;
    }
}
