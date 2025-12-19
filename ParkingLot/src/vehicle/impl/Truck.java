package vehicle.impl;

import vehicle.Vehicle;
import vehicle.VehicleSize;

public class Truck extends Vehicle {

    public Truck(String licenseNumber) {
        super(licenseNumber, VehicleSize.LARGE);
    }
}