package utilities;

import java.util.Arrays;

public class ArraysUtility {
    // prints each integer of an integer array in seperate lines

    public static void printEachElement(int[] array) {

        for (int each : array) {
            System.out.println(each);
        }
    }
// prints each double of a double array in seperate lines

    public static void printEachElement(double[] array) {

        for (double each : array) {
            System.out.println(each);
        }
    }
// prints each char of a char array in seperate lines

    public static void printEachElement(char[] array) {

        for (double each : array) {
            System.out.println(each);
        }
    }

    // prints each string  of a str array in seperate lines
    public static void printEachelement(String[] array) {

        for (String each : array) {
            System.out.println(each);
        }
    }

    // returns the max number for integer array
    public static int max(int[] numbers) {
        Arrays.sort(numbers);// the last index no of the new array gives us the max number. that is why we use sort method.
        return numbers[numbers.length - 1];

    }

    // returns the max number for integer array
    public static double max(double[] numbers) {
        Arrays.sort(numbers);// the last index no of the new array gives us the max number. that is why we use sort method.
        return numbers[numbers.length - 1];

    }

    // returns the minimum number from integer array
    public static int min(int[] numbers) {
        Arrays.sort(numbers);// the last index no of the new array gives us the min number. that is why we use sort method.
        return numbers[0];
    }

    // checks if the given number is in the array
    public static boolean contains(int[] array, double element) {
// {1,2,3,4} 6
        boolean result = false;
        for (int each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    // checks if the given String is in the array
    public static boolean contains(double[] array, double element) {
// {1,2,3,4} 6
        boolean result = false;
        for (double each : array) {
            if (each==element) {// if any array's  element matches with the given element, it means given element is in the array
                result = true;
            }
        }
        return result;
    }

    public static boolean contains(char[] array,char element) {
// {1,2,3,4} 6
        boolean result = false;
        for (char each : array) {
            if (each==element) {// if any array's  element matches with the given element, it means given element is in the array
                result = true;
            }
        }
        return result;
    }

    public static boolean contains(String [] array, String element) {
// {1,2,3,4} 6
        boolean result = false;
        for (String each : array) {
            if (each.equals(element)) {// if any array's  element matches with the given element, it means given element is in the array
                result = true;
            }
        }
        return result;
    }

    public static int [] addElement(int[] array,int element) {
        int [] result = new int [array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[result.length - 1] = element;// element needs to be assigned o the last index
        return result;
    }

    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];
        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[result.length - 1] = element;// element needs to be assigned o the last index
        return result;
    }

    public static char [] addElement(char [] array, char element) {

        char [] result = new char [array.length + 1];

        int i = 0;// thus we dont know the indexes, assign a variable i
        for (char each : array) {// in order to get the each element of the array, we use for each loop
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    public static String [] addElement(String [] array, String element) {

        String [] result = new String[array.length + 1];

        int i = 0;// thus we dont know the indexes, assign a variable i
        for (String each : array) {// in order to get the each element of the array, we use for each loop
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    public static int[] addInteger(int[] array, int element) {

        int[] result = new int[array.length + 1];

        int i = 0;// thus we dont know the indexes, assign a variable i
        for (int each : array) {// in order to get the each element of the array, we use for each loop
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    //create a return method called addDouble  that can add a double after the last index of a double array
    public static double[] addDouble(double[] array, double element) {
        double[] result = new double[array.length + 1];
        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[result.length - 1] = element;// element needs to be assigned o the last index
        return result;
    }

    //create a return method called addString that can add an element after the last index of a String Array
    public static char [] addChar(char [] array, char element) {

        char[] result = new char [array.length + 1];
        int i = 0;

        for (char each : array) {
            result[i++] = each;
        }
        result[result.length - 1] = element;
        return result;
    }

    public static String [] addInteger(String [] array, String element) {

        String [] result = new String [array.length + 1];

        int i = 0;// thus we dont know the indexes, assign a variable i
        for (String each : array) {// in order to get the each element of the array, we use for each loop
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    //returns the freq of each element from the given array
    public static int frequencyOfElement(double[] array, double element) {
        double count = 0;
        for (double each : array) {
            if (each == element) {
                count++;
            }
        }
        return (int) count;
    }

    //returns the freq of each element from the given array
    public static int frequencyOfElement(char[] array, char element) {
        char count = 0;
        for (char each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    // returns the freq of each element from the given array
    public static int frequencyOfElement(String[] array, String element) {
        int count = 0;
        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }
        }
        return count;
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
    public static double[] removeElement(double[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index : " + index);
            System.exit(0);
        }

        double[] result = new double[array.length - 1];// temporary array
        for (int i = 0; i < array.length; i++) {
            if (i != index) {// we can add all elements whose indexes don't mach with the given index
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;
    }

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

    public static double[] merge(double[] arr1, double[] arr2) {

        double[] result = {};
        for (double each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (double each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    public static int [] replace(int [] array, int index, int newElement){
        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }
    // replace the elements of the array at given index with the new element
    public static double [] replace(double [] array, int index, double newElement){
        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }

    // replace the elements of the array at given index with the new element
    public static char [] replace(char [] array, int index, char newElement){
        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }
    // replace the elements of the array at given index with the new element
    public static String [] replace(String [] array, int index, String newElement){
        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;
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

    // remove the duplicates from the array, returns the new array
    public static int [] removeDuplicates ( int [] array){

        int [] result = {};

        for (int each : array) {
            if (!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static double[] removeDuplicates (double [] array){

        double [] result = {};

        for (double each : array) {
            if (!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    public static char [] removeDuplicates(char [] array){
        char [] result = {};

        for (char each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    public static String [] removeDuplicates(String [] array){
        String [] result = {};

        for (String each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
}





