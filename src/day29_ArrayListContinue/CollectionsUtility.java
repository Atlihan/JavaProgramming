package day29_ArrayListContinue;

import javax.lang.model.SourceVersion;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        ArrayList<Integer> List = new ArrayList<>();
        List.addAll(Arrays.asList(10, 9, 8,7,6,5,4,3,2,1));
        Collections.sort(List);

        System.out.println("List = " + List);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println("--------------------------");

        ArrayList<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        Collections.sort(letters);
        System.out.println("letters = " + letters);//[A, B, C, D, E]

        System.out.println("----------------------------");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));
        Collections.swap(list3, 2, 4);

        System.out.println("list3 = " + list3);//[10, 20, 50, 40, 30, 60]

        System.out.println("--------------------------");

        int max = Collections.max(list3);
       int min =  Collections.min(list3);

        System.out.println("min = " + min);//10
        System.out.println("max = " + max);//60

        System.out.println("---------------------------");

        ArrayList<Integer> list4 = new ArrayList<>();

        list4.addAll(Arrays.asList(10, 20, 30, 10, 40,50, 10));
        Collections.replaceAll(list4, 10, 500);
        System.out.println("list4 = " + list4);//[500, 20, 30, 500, 40, 50, 500]

        System.out.println("------------------------------");

        int frequency = Collections.frequency(list4, 40);
        System.out.println("frequency = " + frequency);//1

        System.out.println("------------------------------");

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "C#", "Java", "Python", "Java", "Ruby"));

        int countJava= Collections.frequency(words, "Java");
        int countPython = Collections.frequency(words, "Python");

        System.out.println("countPython = " + countPython);
        System.out.println("countJava = " + countJava);


        








    }
}
