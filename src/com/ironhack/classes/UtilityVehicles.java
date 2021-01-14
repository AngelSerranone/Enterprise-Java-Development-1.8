package com.ironhack.classes;

/** Class that implements abstract class for exercise 3 */

public class UtilityVehicles extends Car {
    // Properties
    protected Boolean fourWheelDrive;

    // Constructor
    public UtilityVehicles(String vinNumber, String make, String model, int mileage, Boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        setFourWheelDrive(fourWheelDrive);
    }

    // Getters & Setters

    public Boolean getFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(Boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }
}
