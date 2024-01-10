package NextPage;

import java.util.Locale;

// //Check if a String is Palindrome: Determine whether a given string is a
//    //palindrome, which means it reads the same forwards and backward. For
//    //example, "madam" is a palindrome.
public class Palindrome {

    public static void main(String[] args) {
        String input = "madam";
        if (isPalindrome(input)) {
            System.out.println(input + " is a palin");
        } else {
            System.out.println(input + " is not a palin ");
        }
    }
        public static boolean isPalindrome(String str){
            String lowerCase=str.replaceAll("\\s","").toLowerCase();
            StringBuilder reverse = new StringBuilder(lowerCase).reverse();
            return lowerCase.equals(reverse.toString());
        }
    }


