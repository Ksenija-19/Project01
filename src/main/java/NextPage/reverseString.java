package NextPage;
//Reverse a String: Write a function to reverse a given string. For example,
//given the input "Hello", the output should be "olleH".
public class reverseString {
    public static void main(String[] args) {
   String givenInput= "hello";
   String reversed= reverse(givenInput);
        System.out.println("Before reverse:"+givenInput);
        System.out.println("After reverse: "+reversed);
    }

    public static String reverse(String str) {
        StringBuilder sb= new StringBuilder(str);
        sb.reverse();
        return sb.toString();



    }
}




