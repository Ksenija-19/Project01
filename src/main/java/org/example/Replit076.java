package org.example;

import java.util.Scanner;

public class Replit076 {
    /*Write a program that creates a String array with size 7.

Ask the user to input Days of a week beginning with Sunday using Scanner class.

Add these inputs to your array and then print all values from that array
 Output
Please enter day 1 of the week
Sunday
Please enter day 2 of the week
Monday
Please enter day 3 of the week
Tuesday
Please enter day 4 of the week
Wednesday
Please enter day 5 of the week
Thursday
Please enter day 6 of the week
Friday
Please enter day 7 of the week
Saturday  */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //creates a String array with size 7
        String[] daysOfWeek = new String[7];
        //Ask the user to input Days of a week
        for (int i = 0; i < daysOfWeek.length; i++) {
            System.out.println("Please enter day " + (i + 1) + " of the week:");
            daysOfWeek[i] = scanner.nextLine();
        }
        System.out.println("The days of the week are:");
        for (String day : daysOfWeek) {
            System.out.println(day);
        }
    }
}

