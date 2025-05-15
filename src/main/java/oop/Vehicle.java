package oop;

// This is the parent class (Base class) demonstrating Encapsulation
public class Vehicle {
    private String brand;     // Encapsulated fields (private access)
    private int year;

    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Getters and Setters for encapsulated fields
    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void start() {
        System.out.println("Vehicle is starting...");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}