package day31_Constructors;

public class Person {

    public String name;
    public char gender;
    public int age;

    public Person (String name,char gender, int age){// CONSTRUCTOR: Instead of using setInfo for each object.
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
