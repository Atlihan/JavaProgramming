package day50_Collection;

import java.util.*;

public class ListSetPractise {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));
        //SET
        System.out.println(set);//[1, 2, 3, 4, 5]
        set.toArray(set.toArray(new Integer[0]));


        //LIST
        List <Integer> list = new ArrayList<>( set );
        System.out.println(list);////[1, 2, 3, 4, 5]

    }
}
