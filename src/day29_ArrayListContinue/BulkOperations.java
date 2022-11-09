package day29_ArrayListContinue;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5));// in stead of adding each element for 5 times with add method
        System.out.println(list);//[1, 2, 3, 4, 5]

        list.removeAll(Arrays.asList(3,4,5));
        System.out.println(list);//[1, 2]

        System.out.println("-------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(100, 200, 300, 400, 500, 600));
        numbers.retainAll(Arrays.asList(400, 500));

        System.out.println(numbers);//[400, 500]

        System.out.println("---------------------------");

        ArrayList<String> jobTitles = new ArrayList<>();

        jobTitles.addAll(Arrays.asList("SDET", "SDET", "Developer", "QA", "QA"," Scrum  Master"));

        jobTitles.retainAll(Arrays.asList("QA", "SDET"));

        System.out.println(jobTitles);//[SDET, SDET, QA, QA]

        System.out.println("--------------------------");
        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1,2,3,4,5,6,7));
        // boolean r1 = nums.contains(1);
       // boolean r2 = nums.contains(2) && nums.contains(3) && nums.contains(4); instead of using separate contains

        boolean r3 = nums.containsAll(Arrays.asList(1,2,3));

        System.out.println("r3 = " + r3);// true

        System.out.println("--------------------------");

        String [] names = {"Josh", "Jack", "Bob"};

        //ArrayList<String> nameList = new ArrayList<>();
        // nameList.addAll(Arrays.asList(names)); One way of converting non-primitive into an ArrayList

        // other way is:
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));

        System.out.println("nameList = " + nameList);

        System.out.println("----------------------");
        Integer [] arr = {1,2,3,4};// non-primitive. If it was primitive (int), then it CAN NOT ADD elements into the Array
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));

        System.out.println("list2 = " + list2);//list2 = [1, 2, 3, 4]

        System.out.println("----------------------------");

        int [] arr2 = {1,2,3,4,5,6,7};

        ArrayList<Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr2));// once we created a method below, we can convert any primitive arry to ArrayList
        System.out.println("list3 = " + list3);//[1, 2, 3, 4, 5, 6, 7]

    }

    public static ArrayList<Integer> convertArrayToArrayList (int [] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }
        return list;

    }
}
