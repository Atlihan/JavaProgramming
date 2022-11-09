package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Java");
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("C#");
        list.add("C#");
        list.add("Ruby");

        System.out.println(list);//[Java, Java, Java, Python, C#, C#, C#, Ruby]

        ArrayList<String> unique = new ArrayList<>();

        for (String each : list) {

            if (list.indexOf(each) == list.lastIndexOf(each)){
                unique.add(each);// to add the unique element into the ArrayList
            }
        }
        System.out.println(unique);//[Python, Ruby]

    }
}
