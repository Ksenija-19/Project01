package NextPage;

public class Page1 {
    public static void main(String[] args) {
    int age = 22;
    int weight = 150;
    if(age>=18){
        System.out.println("you are eligible");
        if(weight>110){
            System.out.println("He/she is eligible");
        }else{
            System.out.println("we cant accept a patient");
        }
    }

    }
}
