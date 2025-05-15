package oop;

// Another child class demonstrating Inheritance and Polymorphism
public class Bike extends Vehicle {

    private boolean hasCarrier;

    public Bike(String brand, int year, boolean hasCarrier) {
        super(brand, year);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void start() {
        System.out.println("Bike is starting with a kick...");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Carrier: " + hasCarrier);
    }
}