package day29_ArrayListContinue;

import utilities.StringUtility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        list.removeIf( p -> p < 5);// Lamda Expression: removoing the numbers only less than 5
        System.out.println("list = " + list);


        System.out.println("----------------------");
        // remove only even numbers from ArrayList
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        list2.removeIf( each -> each %2 == 0 );
        System.out.println("list2 = " + list2);//[1, 3, 5, 7]


        System.out.println("----------------------");

        ArrayList<String> list3 = new ArrayList<>();

        list3.addAll(Arrays.asList("Jane", "James", "Ali", "Marry"));
        list3.removeIf( p -> p.startsWith("J") );

        System.out.println("list3 = " + list3);//[Ali, Marry]


        System.out.println("-----------------------");
// remove all names that are NOT PALINDROME
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna","Bob", " Level", "Python", "Java" ));

        names.removeIf(name -> !StringUtility.isPalindrome(name));

        System.out.println(names);//[Anna, Bob]

    }
}
