package NextPage;

import java.util.Scanner;
import java.util.SortedMap;

public class p11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter number of worked years");
        int yearsWorked = sc.nextInt();
        if(yearsWorked >=5){
            System.out.println("you are eligible for bonus");
            System.out.println("Enter your salary");
        }else{
            System.out.println("you are not eligible");
        }
        double bonus1 = 5000;
        double bonus2 = 3000;
        int annSalary= sc.nextInt();
        if(annSalary>= 5000) {
            System.out.println("you are eligible for bonus" + bonus1);
        }else
            System.out.println("you are eligible for bonus"+ bonus2);

        }



        }


