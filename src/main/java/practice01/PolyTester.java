package practice01;

public class PolyTester {
    public static void main(String[] args) {
        Dog d = new Dog("Jacky","Black",1,"German");
        Cat c= new Cat("Mano","white",5);

        Animal [] animals={d,c};
                for(Animal a:animals){
                    a.eat();
                    a.speak();
                    a.printInfo();
                    System.out.println(a.getName());
                }
    }
}
