package oop;

// This class demonstrates Inheritance (Car IS-A Vehicle)
public class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year); // calling constructor of Vehicle
        this.numberOfDoors = numberOfDoors;
    }

    // Method overriding — Polymorphism
    @Override
    public void start() {
        System.out.println("Car is starting with key ignition...");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + numberOfDoors);
    }
}