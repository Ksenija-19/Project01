package org.example;

public class Test2 {
    //Create a Java program and name it Temperature Check.
    //Create a variable to store temperature. Your program should check
    //if temperature is below 32 then it should print “Water will freeze
    //with temperature __”, otherwise “Water will NOT freeze with
    //temperature __”.
    public static void main(String[] args) {
        int temp=35;
        int temp2=32;
        if(temp<temp2){
            System.out.println("Water will freez with temperature "+ temp2);
        }else{
            System.out.println("Water will NOT freeze with temperature "+ temp );
        }
    }
}
