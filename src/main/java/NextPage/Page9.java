package NextPage;

import java.util.Scanner;

public class Page9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how much money do u need");
        double loan = sc.nextDouble();

        if(loan<=200000) {
            System.out.println("I can lend you money");
        }else{
            System.out.println("you are reject");
        }






    }
}
