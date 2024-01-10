package NextPage;

import java.util.Scanner;

public class Page7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how may years haw you worked");
        int years = sc.nextInt();
        System.out.println("Enter your annual salary");
        int salary = sc.nextInt();
        if(years>=5){
        if(salary>50000){
            System.out.println("you are eligible for bonus");
        }else{
            System.out.println("No bonus");
        }
        }

    }
}
