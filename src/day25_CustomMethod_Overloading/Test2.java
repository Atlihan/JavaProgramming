package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

public class Test2 {

    public static void main(String[] args) {

        int [] arr2 = {1,2,3,4};

        ArraysUtility.printEachElement(arr2);

        System.out.println("--------------------");

        double [] arr3 = {3.5, 4.6, 6.5};
        ArraysUtility.printEachElement(arr3);

        System.out.println("----------------------");

        char []  arr4 = {'A', 'B','C'};
        ArraysUtility.printEachElement(arr4);

        System.out.println("-----------------------");

        int [] n1 = {22, 14, 35, 45, 32};
        int max1 = ArraysUtility.max(n1);
        System.out.println("max1 = " + max1);

        System.out.println("------------------------");

        double[]n2 = {3.5, 4.8, 6.3, 2.5};
        double max2 = ArraysUtility.max(n2);
        System.out.println("max2 = " + max2);

        System.out.println("-----------------------");

        int [] numbers = {1,2,3,4};
        int element = 6;
       boolean result = ArraysUtility.contains(numbers,element);
        System.out.println("result = " + result);

        System.out.println("--------------------------");

        String [] words = {"Book", "cat", "Stone"};
        String word = "cat";
        boolean result2 = ArraysUtility.contains(words,word);
        System.out.println("result2 = " + result2);


    }
}
