package NextPage;

import java.util.Scanner;

public class Page4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how old are you ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("you are approved for DL");
        }else{
            System.out.println("you can get a permit");
        }
    }
}
