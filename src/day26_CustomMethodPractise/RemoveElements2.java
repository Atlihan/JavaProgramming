package day26_CustomMethodPractise;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElements2 {

    public static void main(String[] args) {

        int[] numbers = {100, 200, 300, 400, 500};
        numbers = removeElement(numbers, 1);

        System.out.println(Arrays.toString(numbers));


    }

    // removes the INDEX from the array, returns new array
    public static int[] removeElement(int[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index : " + index);
            System.exit(0);
        }

        int[] result = new int[array.length - 1];// temporary array
        for (int i = 0; i < array.length; i++) {
            if (i != index) {// we can add all elements whose indexes don't mach with the given index
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;
    }
// removes the INDEX from the array, returns new array
    public static double [] removeElement(double [] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index : " + index);
            System.exit(0);
        }

        double [] result = new double [array.length - 1];// temporary array
        for (int i = 0; i < array.length; i++) {
            if (i != index) {// we can add all elements whose indexes don't mach with the given index
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;
    }

}
