package vehicle.impl;

import vehicle.Vehicle;
import vehicle.VehicleSize;

public class Car extends Vehicle {

    public Car(String licenseNumber) {
        super(licenseNumber, VehicleSize.MEDIUM);
    }
}