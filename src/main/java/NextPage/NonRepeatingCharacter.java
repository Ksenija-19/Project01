package NextPage;
//Find the First Non-Repeating Character in a String: Given a string, find and
//return the first non-repeating character. For example, in the string
//"abracadabra", the first non-repeating character is 'c'.

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String input= "abracadabra";
      char result= findChar(input);
        System.out.println("the fist char car is"+ result);
    }

    public static char findChar(String str) {
        int [] charCount= new int[256];
                for(int i=0;i<str.length();i++){
                    charCount[str.charAt(i)]++;
                }
            for (int i = 0; i <str.length() ; i++) {
                if(charCount[str.charAt(i)]==1){
                    return str.charAt(i);
                }
            }
            return '\0';
        }

    }

