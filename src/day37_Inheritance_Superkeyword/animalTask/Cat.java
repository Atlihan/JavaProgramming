package day37_Inheritance_Superkeyword.animalTask;

public class Cat extends Animal{

    public String parrotWingColor;

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
        this.parrotWingColor = parrotWingColor;
    }

}
