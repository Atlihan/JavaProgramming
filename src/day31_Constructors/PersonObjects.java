package day31_Constructors;

public class PersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Daniel", 'M', 29);//Person{name='Daniel', gender=M, age=29}

        Person person2 = new Person("Jolly", 'F', 25);//Person{name='Jolly', gender=F, age=25}
        person2.age = 30;


        System.out.println(person2);


    }
}
