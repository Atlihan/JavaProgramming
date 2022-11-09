package day44_Abstraction;

public final class Cat extends Animal implements Playable{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" "+" eats biryani");
    }

    public void meowing(){
        System.out.println(getName()+" "+ " is meowing");
    }

    @Override
    public void play() {

    }
}
