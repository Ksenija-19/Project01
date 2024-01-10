package NextPage;

import java.util.Scanner;
import java.util.SortedMap;

public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how old are u");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("you can get DL");
        }else{
            System.out.println(("You will get permit"));
        }
    }
}
