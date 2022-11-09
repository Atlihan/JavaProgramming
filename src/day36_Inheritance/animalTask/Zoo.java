package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {
        Dog dog = new Dog("Max","Husky", 'M', 2, "Small", "Black" );
        dog.eat();
        dog.move();
        dog.sleep();
        dog.drink();
        dog.bark();
        System.out.println(dog);

        Cat cat = new Cat("Sally", "British", 'M', 3, "Small", "White");
        cat.eat();
        cat.move();
        cat.sleep();
        cat.drink();
        cat.scratch();
        cat.meow();
        System.out.println(cat);

        Tiger tiger = new Tiger("Sher Khan", "Bengal", 'M', 4, "Large", "red");

        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();
        tiger.hunt();
        tiger.roar();
        System.out.println(tiger);

    }



}
