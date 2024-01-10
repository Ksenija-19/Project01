package org.example;

public class homeworkNestedIf {
    public static void main(String[] args) {
        //2.Create a Java program and store values of mortgage rate and mortgage price.
        // First, program should check if rate is higher than 4.5 user will not buy a house,
        // otherwise user will consider buying. Once user decides to buy a house,
        // if price of the house is larger than 100,000 than user will take a loan,
        // otherwise user will pay cash.

        double mortageRate =3.5;
        int morgatePrice = 200000;
        if(mortageRate<4.5){
            System.out.println("user will not buy a house");
        }else if (mortageRate>4.5){
            System.out.println(" user will consider buying");
        }else if(morgatePrice>100000){
            System.out.println("user will take a loan");
        } else if (morgatePrice<100000){
            System.out.println("user will pay cash");
        }


        }
}
