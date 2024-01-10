package NextPage;
//Count the Number of Words in a String: Write a function to count the
// number of words in a given string. Words are separated by spaces or
// punctuation. For example, the input "Hello, world!" should return 2.
public class Words {
    public static void main(String[] args) {
        String givenSt=  "Hello, world!";
        int countWords= wordsCount(givenSt);
        System.out.println("Num of the words"+countWords);
    }

    public static int wordsCount(String str) {
        String [] words=str.split("[\\s\\p{Punct}]+");
        return words.length;

    }
}
