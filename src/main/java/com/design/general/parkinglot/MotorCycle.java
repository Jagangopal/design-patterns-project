package com.design.general.parkinglot;

public class MotorCycle extends Vehicle{
    public MotorCycle(){
        spotsNeeded = 1;
        size = VehicleSize.MotorCycle;
    }
    @Override
    public boolean canFitinSpot(ParkingSpot spot) {
        return false;
    }
}
