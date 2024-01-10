package practice01;

public abstract class Animal {

    private String name;

    private String color;

    private int age;

    public Animal(String name,String color,int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public abstract void eat();

    public abstract void speak();
    public void printInfo(){
        System.out.println(name+" "+color+" "+age); //

    }

}
class Dog extends Animal{
    String breed;

    public Dog(String name,String color,int age,String breed){ //this is a metching constructor
        super(name,color,age);
        this.breed=breed;
    }

    @Override
    public void eat() {
        System.out.println("Dogs like to eat bones and meet");
    }

    @Override
    public void speak() {
        System.out.println(" Wuff Wuff");
    }

    @Override
    public void printInfo() {
        super.printInfo(); //ova linija ce isprintati color,name,age iz parent class i onda dodas u sout breed, onda ce isprintati I breed
        System.out.println(breed);
    }
}
class Cat extends Animal{

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void eat() {
        System.out.println("CAts like to eat fish");

    }

    @Override
    public void speak() {
        System.out.println("Meow meow");

    }
}
