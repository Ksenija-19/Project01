package NextPage;

import java.util.Scanner;

public class Page5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Can you enter city ");
        String city=sc.nextLine();
        sc.nextLine();
        System.out.println("Please enter temp in F "+ city);
        double temp=sc.nextDouble();
        double tempInCelsius=(temp-32)*5.0/9.0;
        System.out.println("temp in "+ city+"is "+tempInCelsius+ "C");
    }
}
