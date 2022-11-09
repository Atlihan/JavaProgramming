package day26_CustomMethodPractise;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5};

        int[] arr3 = merge(arr1, arr2);
        System.out.println(Arrays.toString(arr3));//[1, 2, 3, 4, 5]
    }
    // merge given two arrays

    public static int[] merge(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];
        int i = 0;// index of new array: in order to assign the every index of arr1 and arr2 to the new array

        for (int each : arr1) {
            result[i++] = each;
        }
        for (int each : arr2) {
            result[i++] = each;
        }
        return result;
    }

}
