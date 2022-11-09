package day26_CustomMethodPractise;

import day25_CustomMethod_Overloading.AddElementsToArray2;
import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        int[] array = {1, 2, 2, 2, 2, 2, 3, 3, 3, 4};
        int[] uniqueElement = uniqueElements(array);
        System.out.println(Arrays.toString(uniqueElement));

        System.out.println("---------------------");
        double[] array2 = {1.5, 2.5, 2.5, 3.5, 3, 5};

        double[] unique = uniqueElements(array2);

        System.out.println(Arrays.toString(unique));


    }

    // returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array) {

        int[] result = {};
        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[] array) {

        double[] result = {};
        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // returns the unique elements of the array as a new array

    }

