package day49_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class SetPractise2 {

    public static void main(String[] args) {

            String [] arr = {"Wooden Spoon", "Java", "Wooden Spoon", "Milk", "Eggs", "Wooden Spoon", "Paper Towels"};
            new LinkedHashSet<>(Arrays.asList(arr) ).toArray( new String [0] );

        System.out.println(Arrays.asList(arr));
        //[Wooden Spoon, Java, Wooden Spoon, Milk, Eggs, Wooden Spoon, Paper Towels]

        System.out.println("-------------------------------");

        String [] array ={"A", "B", "C", "D"};

        List<String> s = new ArrayList<>( Arrays.asList(array));

       s.addAll( Arrays.asList("E", "F", "G"));

        System.out.println(Arrays.asList(s));

        System.out.println("------------------------------");




    }
}
