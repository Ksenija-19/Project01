package NextPage;

import java.util.ArrayList;
import java.util.List;

//How can you remove all duplicates from ArrayList
public class RemoveDuplicate {
        public static void main(String[] args) {
            ArrayList<String> inputSt= new ArrayList<>();
            inputSt.add("Apples");
            inputSt.add("Banana");
            inputSt.add("Oranges");
            inputSt.add("Banana");
            inputSt.add("Oranges");
            inputSt.add("Apples");
            List<String> uniqueList= removeDuplicates(inputSt);
            System.out.println("Originale list: "+inputSt);
            System.out.println("List without Duplicates:" +uniqueList);
        }
        public static List<String>removeDuplicates(ArrayList<String>inputSt){
            return new ArrayList<>(List.copyOf(inputSt));
        }

}
