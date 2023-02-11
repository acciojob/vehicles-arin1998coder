package com.driver;

public class Boat implements WaterVehicle{

    @Override
    public String getVehicleName() {
        return "Boat";
    }

    @Override
    public int getVehicleCapacity() {
        return 4;
    }
}
