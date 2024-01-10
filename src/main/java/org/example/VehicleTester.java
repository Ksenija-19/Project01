package org.example;

public class VehicleTester {

    public static void main(String[] args) {

        Vehicle [] arr ={new Car1("toyota","camry",5),new Truck("Jeep","pick up",7),new Motorcycle("BMW","ksajska",9) };
        for(Vehicle v: arr){
            v.startEngine();
            v.stopEngine();
            v.fuelUp();
        }
    }
}