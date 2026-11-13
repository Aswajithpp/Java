package Oops;

class Vehicle {
    String color;

    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    String brand = "Toyota";

    public void drive() {
        System.out.println("Car is driving...");
    }
}

class ElectricCar extends Car {
    int batteryPercentage = 100;

    public void charge() {
        System.out.println("Electric car is charging...");
    }
}

class Bike extends Vehicle {
    String model = "Royal Enfield";

    public void ride() {
        System.out.println("Bike is riding...");
    }
}

public class Work {

    public static void main(String[] args) {

        Bike b = new Bike();

        System.out.println("Bike Model: " + b.model);
        System.out.println("Bike Color: " + (b.color = "Black"));

        b.start();
        b.ride();


        Car c = new Car();

        System.out.println("Car Brand: " + c.brand);
        System.out.println("Car Color: " + (c.color = "White"));

        c.start();
        c.drive();


       
    }
}