package vehicle.impl;

import vehicle.Vehicle;
import vehicle.VehicleSize;

public class Bike extends Vehicle {

    public Bike(String licenseNumber) {
        super(licenseNumber, VehicleSize.SMALL);
    }
}