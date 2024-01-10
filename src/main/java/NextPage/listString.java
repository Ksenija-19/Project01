package NextPage;

import java.util.ArrayList;
import java.util.List;

//You have a list of strings and you want to keep only those that start with
//“A” and you want to return them in lower case.
public class listString {
    public static void main(String[] args) {
        List<String> stringList= new ArrayList<>();
        stringList.add("Apples");
        stringList.add("Bananas");
        stringList.add("Avocado");
        List<String> filter= filterList(stringList);
        System.out.println("List that starts w an A"+ filter);
    }

    public static List<String>filterList(List<String> inputList) {
        List<String> result= new ArrayList<>();
        for(String str:inputList){
            if(str.startsWith("A")){
                result.add(str.toLowerCase());
            }
        }
        return result;

    }
    }