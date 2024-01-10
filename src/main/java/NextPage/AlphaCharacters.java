package NextPage;
// //Find out how many alpha characters are present in a string?
public class AlphaCharacters {
    public static void main(String[] args) {
        String input= "Hello123World";
        int alphaCount = countAlpha(input);
        System.out.println("Number of alphabetical characters: " + alphaCount);
    }

    public static int countAlpha(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}