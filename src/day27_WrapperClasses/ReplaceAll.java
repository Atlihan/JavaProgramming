package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {

    public static void main(String[] args) {

        int [] arr = {1, 2, 30, 3, 30, 4, 30};

        arr = replaceAll(arr, 30, 300);
        System.out.println(Arrays.toString(arr));// [1, 2, 300, 3, 300, 4, 300]

    }
// replaces all matching old values of the array with new value
    public static int [] replaceAll (int [] array, int oldValue, int newValue){

        for (int i = 0; i < array.length; i++) {

            if (array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;

    }

    // replaces all matching old values of the array with new value
    public static double [] replaceAll (double [] array, double oldValue, double newValue){

        for (int i = 0; i < array.length; i++) {

            if (array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }

    // replaces all matching old values of the array with new value
    public static char [] replaceAll (char [] array, char oldValue, char newValue){

        for (int i = 0; i < array.length; i++) {

            if (array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }

    // replaces all matching old values of the array with new value
    public static String [] replaceAll (String [] array, String oldValue, String newValue){

        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(oldValue)){
                array[i]=newValue;
            }
        }
        return array;
    }
}
