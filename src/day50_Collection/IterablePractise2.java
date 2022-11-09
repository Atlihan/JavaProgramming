package day50_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractise2 {

    public static void main(String[] args) {
        // remove all the names Ahmed
        List<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Ahmed", "aHmed", "Julia", "Sally", "ahMED", "Mike"));

       Iterator<String> it = names.iterator();

       while (it.hasNext()){
           if (it.next().equalsIgnoreCase("ahmed")){
               it.remove();
           }
       }
        System.out.println(names);//[Julia, Sally, Mike]
    }
}
