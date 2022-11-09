package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);//[100, 200, 300, 400, 500]
        /* way of removing with Primitive
        int num  = 1;
        list.remove(num);
         */
        // way of removing with Object (wrapper class)
        Integer num = 200;
       boolean r =  list.remove(num);

       System.out.println(list);//[100, 300, 400, 500]

        System.out.println("r = " + r);//r = true

        System.out.println("------------------------");

        System.out.println(list.size());//4

        list.clear();
        System.out.println(list.size());//0
        System.out.println(list);//[]

        System.out.println("------------------------");
        ArrayList<Character> characters = new ArrayList<>();

        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A');// 0
        int b = characters.lastIndexOf('A');// 3

        System.out.println(a);// 0
        System.out.println(b);// 3

        System.out.println("--------------------------");

        boolean r1= characters.contains('A');
        System.out.println("r1 = " + r1);

        System.out.println("-----------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(10);
        list1.add(10);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(10);
        list2.add(10);
        list2.add(10);
        System.out.println(list1.equals(list2));// true

        System.out.println("---------------------");

         boolean r3 = list1.isEmpty();
        System.out.println("r3 = " + r3);// false

        System.out.println("------------------------");
//bulk operation

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4));
        System.out.println(numbers);//[1, 2, 3, 4]














    }
}
