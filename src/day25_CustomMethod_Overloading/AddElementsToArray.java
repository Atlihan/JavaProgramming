package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray {

    public static void main(String[] args) {

        int [] arr = { 1,2,3,4};

       arr = addInteger(arr, 5);// by assigning arr back, we have the new array including all elements
        System.out.println(Arrays.toString(arr));// we have created a new array, DID NOT ADD an element in the array

        System.out.println("==================");
        double [] arr2 = { 1.5, 2.5, 3.5};
        arr2=addDouble(arr2, 5.5);
    }
// .create a return method called addInteger  that can add an ineteger after the last index of an integer
    public static int [] addInteger(int [] array, int element){

        int [] result = new int[array.length + 1];

        int i =0;// thus we dont know the indexes, assign a variable i
        for (int each : array) {// in order to get the each element of the array, we use for each loop
            result[i++]=each;
        }
        result[i]= element;
        return result;
    }

    //create a return method called addDouble  that can add a double after the last index of a double array
    public static double[] addDouble(double[] array, double element ){
        double []result = new double[array.length+1];
        int i = 0;
        for (double each : array){
            result[i++] = each;
        }
        result[result.length-1] = element;// element needs to be assigned o the last index
        return result;
    }

    //create a return method called addString that can add an element after the last index of a String Array
    public static String [] addString(String [] array, String element){

        String[] result = new String[array.length+1];
        int i = 0;

        for (String each : array) {
            result[i++]=each;
        }
        result[result.length-1] = element;
        return result;
    }


}
/*
1.create a return method called addInteger  that can add an ineteger after the last index of an integer

 */
