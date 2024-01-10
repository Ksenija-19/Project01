package NextPage;

import java.util.Scanner;

public class Page6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you have a credit card ");
        String user = sc.nextLine();
        System.out.println("would u like a credit card ");
        String user1 = sc.nextLine();
        System.out.println("What balance is on the card");
        int balance = sc.nextInt();
        if(balance>1000){
            System.out.println("pay off immediately");
        }else{
            System.out.println("you can spend more");

        }


    }
}
