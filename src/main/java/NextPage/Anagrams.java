package NextPage;

import java.lang.reflect.Array;
import java.util.Arrays;

//Check if Two Strings are Anagrams: Given two strings, determine if they
//are anagrams, meaning they contain the same characters in a different order.
//For example, "listen" and "silent" are anagrams.
public class Anagrams {
    public static void main(String[] args) {
        String st1 = "listen";
        String st2 = "silent";
        if(AreAnagams(st1,st2)){
            System.out.println(st1+"and "+st2+" are Anagrams");
        }else{
            System.out.println(st1+"and "+st2+" are NOT Anagrams");
        }
          }
          public static boolean AreAnagams(String s1,String s2){
              String lowerCases1= s1.replaceAll("\\s", "").toLowerCase();
              String lowerCases2=s2.replaceAll("\\s", "").toLowerCase();

              if (lowerCases1.length()!= lowerCases2.length()){
                  return false;
              }
              char[] charArray1 = lowerCases1.toCharArray();
              char[] charArray2 = lowerCases2.toCharArray();

              Arrays.sort(charArray1);
              Arrays.sort(charArray2);
              return Arrays.equals(charArray1, charArray2);
          }
}