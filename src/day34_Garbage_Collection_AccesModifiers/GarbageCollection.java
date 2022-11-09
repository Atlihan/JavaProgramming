package day34_Garbage_Collection_AccesModifiers;

import day30_CustomClasses.Dog;
import day32_Constructor.Car;
import day33_Statics.Iphone;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public static void main(String[] args) {

        String str = null;// this means there is no object

        String str2 = "Wooden Spoon";
        str2 = null;

        System.out.println(str2);//null


        Car car1 = new Car("Toyota");
        car1 = null;

        System.out.println(car1);// null

        System.out.println("--------------------");

        Dog dog1 = new Dog();
        dog1.name = "Luccy";

        dog1 = new Dog();
        dog1.name = "MAx";

        System.out.println(dog1);//null

        System.out.println("---------------------");

        String language = "Pthyon";
        language = "Java";
        System.out.println(language);//null

        System.out.println("--------------------");

        ArrayList<Integer>list1 = new ArrayList<>();
        list1.add(100);

        ArrayList<Integer>list2 = list1;
        list2.addAll(Arrays.asList(200,300));

        System.out.println("list1 = " + list1);//list1 = [100, 200, 300]
        System.out.println("list2 = " + list2);//list1 = [100, 200, 300]

        System.out.println("-----------------------");






    }
}
