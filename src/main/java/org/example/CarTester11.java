package org.example;

public class CarTester11 {
    public static void main(String[] args) {
        Car11 c1 = new Car11("Toyota", "Prius",4, 120, 30000.0);
        Car11 c2=new Car11("Toyota", "Prius",4, 120, 30000.0);
        Car11 c3= new Car11("unknown", "unknown", 4, 120, 30000.0);
        Car11 c4= new Car11("Toyota", "Prius", 4, 90, 0.0);
        c1.printCarDisplay();
        c2.printCarDisplay();
        c3.printCarDisplay();
        c4.printCarDisplay();


    }
}

