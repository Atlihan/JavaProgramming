package day26_CustomMethodPractise;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray2 {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};

        int [] arr2 = reverse(arr);

        System.out.println(Arrays.toString(arr2));

    }

    public static int [] reverse(int [] arr){

        int [] result = {};

        for (int i = arr.length - 1; i >= 0; i--) {
            ArraysUtility.addElement(result,arr[i]);// i represents the each index of the array starting from last index
        }
        return result;
        
    }
}
