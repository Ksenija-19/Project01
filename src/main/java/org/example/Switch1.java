package org.example;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your country");
        String country = sc.nextLine();
        if (country.toLowerCase().equals("usa")) {
            System.out.println("English");
        } else {
            if (country.toLowerCase().equals("rusia")) {
                System.out.println("Russian");
            } else if (country.toLowerCase().equals("spain")) {
                System.out.println("Spanish");
            } else if (country.toLowerCase().equals("serbia")) {
                System.out.println("Serbian");
            } else if (country.toLowerCase().equals("germany")) {
                System.out.println("Germany");

                System.out.println("Invalid country");
            } else {
                System.out.println("Invalid country");
            }
        }
    }
}


