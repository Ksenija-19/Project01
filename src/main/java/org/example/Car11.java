package org.example;

public class Car11 {
    private String make;
    private String model;
    private int numberOfDoors;
    private int topSpeed;
    private double price;

    public Car11(String make, String model, int numberOfDoors, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public Car11(String make, String model, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = 4;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public Car11(int numberOfDoors, int topSpeed, double price) {
        this.make = "unknown";
        this.model = "unknown";
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public Car11(String make, String model, int numberOfDoors) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = 90;
        this.price = 0;
    }

    public void printCarDisplay() {
        System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);
    }
}


