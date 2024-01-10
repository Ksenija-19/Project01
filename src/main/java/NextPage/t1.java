package NextPage;
//     //Find out how many alpha characters are present in a string?

public class t1 {
    public static void main(String[] args) {
        String input = "Live is getting better in 2024";
        int alphaCaount= CountAplha(input);
        System.out.println("Number of aplha caracters:"+alphaCaount);
    }

    public static int CountAplha(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))){
                 count++;
            }

        }
        return count;
    }
}
