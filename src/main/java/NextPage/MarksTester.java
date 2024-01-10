package NextPage;

public class MarksTester {
    public static void main(String[] args) {
        Marks studentA= new A(70,88,90);
        Marks StudentB=new B(85,95,75,92);
        System.out.println("Student Precent A:"+studentA.Percentage());
        System.out.println("Student precent B: "+StudentB.Percentage());
    }
}
