package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractise1 {

    public static void main(String[] args) {

        String [] countries = {"Japan", "Turkey", "United Kingdom", "United States", "France"};
// converting an Array to an ArrayList
        ArrayList<String>  list = new ArrayList<>(Arrays.asList(countries) );

        list.removeIf( p-> p.length() >= 10);

        // converting the ArrayList to the ARRAY
        countries = list.toArray(new String[0]);
        System.out.println(Arrays.toString(countries));//[Japan, Turkey, France]
    }
}
