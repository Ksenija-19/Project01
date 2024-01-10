package org.example;

/*Vehicle Management System: Design a base class Vehicle with methods like startEngine(),
 stopEngine(), fuelUp(), and fields like make, model, and fuelLevel.
 Create subclasses like Car, Truck, and Motorcycle,
 each with specific implementations for the methods,
  considering their unique characteristics.
 */

    public abstract class Vehicle {
        String make;
        String model;
        int fuelLevel;

        public Vehicle(String make,String model,int fuelLevel){
            this.make=make;
            this.model=model;
            this.fuelLevel=fuelLevel;
        }

        public abstract void startEngine();

        public abstract void stopEngine();
        public abstract void fuelUp();
    }

    class Car1 extends Vehicle{


        public Car1(String make, String model, int fuelLevel){
            super(make,model,fuelLevel);}

            @Override
            public void startEngine() {
                System.out.println("Start your engine");
            }
            @Override
             public void fuelUp(){
                System.out.println("Before drive we should fuel up");
            }
            @Override
            public void stopEngine(){
                System.out.println("stop your engine");
            }
        }
        class Truck extends Vehicle{
            public Truck(String make,String model,int fuelLevel){
                super(make,model,fuelLevel);
        }
        public void startEngine(){
            System.out.println("turn on your TRUCK");
            }
            public void stopEngine(){
                System.out.println("Truck broke down");}
            @Override
            public void fuelUp() {
            }
        }
        class Motorcycle extends org.example.Vehicle{
        public Motorcycle(String make,String model,int fuelLevel){
            super(make,model,fuelLevel);
        }

            @Override
            public void startEngine() {
                System.out.println("Drive your motorcycle");
            }
            @Override
            public void stopEngine() {
                System.out.println("Motorcycle stopped no gas");
            }
            public void fuelUp(){
            System.out.println("Lets put some gas");
        }
        }


