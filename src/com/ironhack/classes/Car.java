package com.ironhack.classes;

/** Abstract class for exercise number 3 */

public abstract class Car {
    // Properties
    protected String vinNumber;
    protected String make;
    protected String model;
    protected int mileage;

    // Constructor
    public Car(String vinNumber, String make, String model, int mileage) {
        setVinNumber(vinNumber);
        setMake(make);
        setModel(model);
        setMileage(mileage);
    }

    // Getters & Setters
    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
