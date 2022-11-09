package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractise2 {

    public static void main(String[] args) {
// retaining some employees
        ArrayList<String> employees = new ArrayList<>();

        employees.addAll(Arrays.asList("Zeliha", "Ali", "Ahmet", "Jimmy", "Daniel", " Aaron"));

        employees.retainAll(Arrays.asList("Ali","Jimmy"));

        System.out.println(employees);//[Ali, Jimmy]

        System.out.println("----------------------------------");
    //remove names starting with 'A'

        String [] names = {"Zeliha", "Ali", "Ahmet", "Jimmy", "Daniel", "Aaron"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names)); //first we convert the Array into the List

        list.removeIf(p-> p.startsWith("A"));
        // or: list.removeIf(p-> p.charAt('0')== A);

        //  converting the List to a new Array

        names = list.toArray(new String[0]);

        System.out.println("list = " + list);//[Zeliha, Jimmy, Daniel]
        System.out.println(Arrays.toString(names));

    }
}
