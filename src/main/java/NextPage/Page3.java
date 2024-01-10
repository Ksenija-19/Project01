package NextPage;

import java.util.Scanner;

public class Page3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much money do u need?");
        double loan = sc.nextDouble();
        if(loan<=200000){
            System.out.println("Lend the money");
        }else{
            System.out.println("reject client");
        }
    }
}
