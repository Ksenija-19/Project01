package NextPage;
//Write a program to swap 2 String without a temporary variable?
public class SwapString {
    public static void main(String[] args) {

        String st1 = "Hello";
        String st2 = "world";
        System.out.println(st1+st2);

        st1=st1.concat(st2);
        st2=st1.substring(0,st1.length()-st2.length());
        st1=st1.substring(st2.length());
        System.out.println(st1+st2);

    }
}
