package NextPage;

public class Page2 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        int num3 = 9;
        if(num1>num2) {
            if (num1 > num3) {
                System.out.println("The largest number is " + num1);
            }
        }else{
            if(num2>num3){
                System.out.println("num 2 is the largest "+ num2);
            }else{
                System.out.println("num3 is the largest "+num3);
            }
        }
    }
}
