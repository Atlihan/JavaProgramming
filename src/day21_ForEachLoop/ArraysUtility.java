package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5};

        System.out.println( Arrays.toString(nums) );//[1, 2, 3, 4, 5] this helps us printing the WHOLE ARRAY
        System.out.println( nums);//[I@3f0ee7cb

        /*
        System.out.println(nums); we can NOT excecute Array by this method
         */
        System.out.println( nums[0]);//this prints only an element in the Array. NO NEED to toString method

        System.out.println("===================================");

        // sort()> sorts the array in ascending order
        int [] scores = {95, 100, 55, 65, 85};
        Arrays.sort(scores);// sort() method helps us to find the min or max number in the array

        System.out.println( Arrays.toString(scores));// once we sort all elements in ascending order [55, 65, 85, 95, 100]
        // then we can find the min or max element
        System.out.println("Min number : "+ scores[0]);// index 0 represent the smallest element
        System.out.println("Max number : "+ scores[scores.length-1]);

        // how about words in tha array;
        String [] names = {"James", "Anna", "Ali", "Gunay"};
        Arrays.sort(names);
        System.out.println( Arrays.toString(names));// [Ali, Anna, Gunay, James]

        System.out.println("======================");

        // equals()

        int [] arr1 = {1,2,3};
        int [] arr2 = {1,3,2};
        boolean r1 = Arrays.equals(arr1,arr2);
        System.out.println( r1);// this results in FALSE\ but if we use sort:

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r2 = Arrays.equals(arr1,arr2);
        System.out.println(r2);// then this results in TRUE

        System.out.println("===========================");
         char [] ch1 = { 'a', 'c', 'b'};
         char [] ch2 = {'b', 'a', 'c'};

         Arrays.sort(ch1);
         Arrays.sort(ch2);

         boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println("anagram = "+anagram);// ture

        System.out.println("===================");

        // copyOf() method: copying one array to another array



    }
}
