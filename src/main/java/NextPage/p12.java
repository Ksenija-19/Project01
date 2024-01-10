package NextPage;

import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        Scanner hasCCScanner = new Scanner(System.in);
        System.out.println("Do you have credit card?");
        Scanner balanceScanner = new Scanner(System.in);
        int balance;
        String hasCC = hasCCScanner.nextLine();
        if (hasCC.toLowerCase().equals("yes")) {
            System.out.println("What is the balance on the card?");
            balance = balanceScanner.nextInt();
            if (balance > 1000)
                System.out.println("Pay it off");
            else
                System.out.println("Spend more");
        } else if(hasCC.toLowerCase().equals("no"))
            System.out.println("Would you like one?");
        else
            System.out.println("Invalid input");
    }
}
