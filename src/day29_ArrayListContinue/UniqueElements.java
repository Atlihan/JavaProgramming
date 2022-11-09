package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
// find the unique elements and add into ArrayList
    public static void main(String[] args) {
// 1 st solution
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,3,4,5,6,6,7,7));

        ArrayList<Integer> unique = new ArrayList<>();

        for (Integer each : list) {
            int frequency = Collections.frequency(list, each);
            if (frequency ==1){
                unique.add(each);
            }
        }
        System.out.println("unique = " + unique);//[2, 4, 5]

        System.out.println("---------------------------------");
// 2 nd Solution
        ArrayList<Integer> list2 = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,3,4,5,6,6,7,7));

        ArrayList<Integer> unique2 = new ArrayList<>(list2);// first, adds all the elements of list2 into unique 2 Array

        unique2.removeIf(p-> Collections.frequency(list2, p)>1 );

        System.out.println("unique2 = " + unique2);



    }
}
