package com.ironhack.classes;

/** Class that implements abstract class for exercise 3 */

public class Truck extends Car {
    // Properties
    protected int towingCapacity;

    // Constructor
    public Truck(String vinNumber, String make, String model, int mileage, int towingCapacity) {
        super(vinNumber, make, model, mileage);
        setTowingCapacity(towingCapacity);
    }

    // Getters & Setters
    public int getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }
}
