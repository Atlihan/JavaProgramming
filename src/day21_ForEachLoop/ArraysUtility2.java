package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {

    public static void main(String[] args) {

        String [] students= {"Elif", "Sinem", "Gunay","James", "Aaron"};
        String [] earlyBirds = Arrays.copyOf(students, 3);// 3 is the number elements from the array

        System.out.println(Arrays.toString(earlyBirds));
        System.out.println("============================");

        int [] numbers = {1,2,3,4,5,6,7};
        numbers=Arrays.copyOf(numbers,4);// if we want only the first four element in the array
        System.out.println(Arrays.toString(numbers));// 

        System.out.println("=======================");

        // copyOfRange Method: from one element to an other in the array

        char [] ch1 = {'A','B','C','D','E'};
        char [] ch2 = Arrays.copyOfRange(ch1, 2, 4);
        System.out.println( Arrays.toString(ch2));// [C, D]





    }
}

