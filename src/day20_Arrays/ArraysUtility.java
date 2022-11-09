package day20_Arrays;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int [] numbers = {10, 9, 0, 1, 20, };

        System.out.println(Arrays.toString(numbers));// [10, 9, 0, 1, 20]

        Arrays.sort(numbers);// sorts the array in ascending order
        System.out.println(Arrays.toString(numbers));// [0, 1, 9, 10, 20]
    }
}
