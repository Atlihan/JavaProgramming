package day47_Polymorphism;

import day44_Abstraction.Animal;
import day44_Abstraction.Dog;
import day45_Abstraction.shape.Circle;
import day45_Abstraction.shape.Shape;

public class ReferrenceTypeCasting {

    public static void main(String[] args) {

      //  Shape shape = (Shape) new Circle(3);// upcasting

        Shape shape2 = new Circle(5);// no need to add (Shape) cast operator


        Animal animal = (Animal) new Dog("Max", "Husky", 'M', 3, "M", "Black");

        Dog dog = (Dog)animal;//downcasting
        dog.bark();
       // ((Dog)animal ).bark(); or we can use this method

        System.out.println(animal.getName());
        System.out.println(dog.getName());

       // animal.bark(); we CAN NOT assign w'thout adding cast operator
        System.out.println("------------------");

        Shape s1 = new Circle(10);

        s1.area();
        s1.perimeter();

      //  ( (Cube)s1).volume(); we CAN NOT ASSIGN Circle to Cube. Because there is not IS A RELATION


    }
}
