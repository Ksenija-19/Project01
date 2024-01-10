package org.example;

public class Replit071 {
    //Write a program that creates an array of integers that stores the following values: 45,78, 12,  67, 55, 89, 23, 77, 88
    //
    //Print only values that stored with even index including 0.
    public static void main(String[] args) {
        int [] numbers = {45,78, 12,  67, 55, 89, 23, 77, 88};
        System.out.println();
        for( int i =0; i<numbers.length;i=i+2){
            System.out.print(numbers[i]+" ");

        }

    }
}
