package oop;

public class Main {
    public static void main(String[] args) {

        // Using Polymorphism - reference of Vehicle, actual object is Car
        Vehicle car = new Car("Toyota", 2022, 4);
        Vehicle bike = new Bike("Honda", 2021, true);

        // Encapsulation: we are not directly accessing fields like car.brand

        // Both will call their own start() implementation (Polymorphism)
        car.start();
        car.displayInfo();

        System.out.println();

        bike.start();
        bike.displayInfo();
    }
}