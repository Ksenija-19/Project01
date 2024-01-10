package NextPage;
//Create a method to count how many vowels are present in a string
//“documentation
public class Vowels {
    public static void main(String[] args) {
        String input = "documentation";
        int countVowels = VowelsCount(input);
        System.out.println("how many vowels:" + countVowels);
    }

    public static int VowelsCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'o' || ch == 'e' || ch == 'u'||ch=='i') {
                count++;
            }
        }
        return count;
    }
}



