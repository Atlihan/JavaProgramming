package day48_Collections;

import java.util.*;

public class ListIntro {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10, 20, 30, 40));
        System.out.println(list1.get(0));


        List<Integer> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList(10, 20, 30, 40));
        System.out.println(list2.get(0));

        List<Integer> list3 = new Stack<>();
        list3.addAll(Arrays.asList(10, 20, 30, 40));
        System.out.println(list3.get(0));


        List<Integer> list4 = new Vector<>();
        list4.addAll(Arrays.asList(10, 20, 30, 40));
        System.out.println(list4.get(0));

        System.out.println("============================");


        System.out.println(list3);
        ((Stack)list3).pop();// The LIFO method in Stack\ the last element is removed from the list

        System.out.println(list3);//[10, 20, 30]
    }
}
