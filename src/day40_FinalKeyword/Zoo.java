package day40_FinalKeyword;

import org.w3c.dom.ls.LSOutput;

public class Zoo {

    public static void main(String[] args) {
        Dog dog = new Dog("Max", "Husky", 'M', "Black", "M", 4);

        System.out.println(dog.getBreed());
        System.out.println(dog.getGender());

        dog.drink();

    }



}
