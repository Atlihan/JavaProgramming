package day30_CustomClasses;

public class Dog {

    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor ){

        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender = dogGender;
        size = dogSize;
        color = dogSize;

        // once we assign the SetInfo Method, then we don't need to call each instances one by one for the dog3

    }

    public void eat(){
        System.out.println(name+ " is eating");
    }

    public void bark (){
        System.out.println(name+ " is barking");
    }

// in order to print each Object, we should generate toString method
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

/*
Attributes
name gender breed

Actions
eat bark


 */
