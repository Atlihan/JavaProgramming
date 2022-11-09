package day50_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractise {

    public static void main(String[] args) {

        // remove all elements smaller than 4
       List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

       Iterator<Integer> it =list.iterator();

       /*boolean r1 = it.hasNext();
        System.out.println(it.next());

        boolean r2 = it.hasNext();
        System.out.println(it.next());

        */

        while (it.hasNext()){
            if (it.next() < 4){
                it.remove();
            }
        }
        System.out.println(list);//[4, 5, 4, 5, 4, 5]

        System.out.println("-------------------------");

        // OR instead of While loop we can use removeIf() method
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        list2.removeIf( each-> each <4);
        System.out.println(list2);//[4, 5, 4, 5, 4, 5]


    }
}
