package org.example;

public class Replit073 {
    //Write a program that creates an array of strings with the following values{"This", "is", "array", "of", "strings"} and prints all values in one line.
    //**Output:**
    //This is array of strings
    public static void main(String[] args) {
        String[] words = {"This", "is", "array", "of", "strings"};
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
