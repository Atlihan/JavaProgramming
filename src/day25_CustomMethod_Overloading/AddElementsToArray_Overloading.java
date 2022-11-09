package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray_Overloading {

    public static void main(String[] args) {

        int [] numbers  = {1,2,3,4,5,6};// 7
        numbers = addElement(numbers, 7);

        char [] chars  = {'A', 'B','C','D'};//'E'
        chars = addElement(chars,'E');

        String [] names = {"Ali", "Ahmet", "Oleksandr"};// lyan
        names = addElement(names, "Lyan");

        System.out.println("names = " + Arrays.toString(names));
        System.out.println("chars = " + Arrays.toString(chars));
        System.out.println("numbers = " + Arrays.toString(numbers));

        // by using only addElement method, we can add all int, string and char array to new array

    }

    public static int [] addElement(int [] array, int element){

        int [] result = new int[array.length + 1];

        int i =0;// thus we dont know the indexes, assign a variable i
        for (int each : array) {// in order to get the each element of the array, we use for each loop
            result[i++]=each;
        }
        result[i]= element;
        return result;
    }

    public static double[] addElement(double[] array, double element ){
        double []result = new double[array.length+1];
        int i = 0;
        for (double each : array){
            result[i++] = each;
        }
        result[result.length-1] = element;// element needs to be assigned o the last index
        return result;
    }
    public static char [] addElement(char [] array, char element){

        char [] result = new char[array.length + 1];

        char i =0;// thus we dont know the indexes, assign a variable i
        for (char each : array) {// in order to get the each element of the array, we use for each loop
            result[i++]=each;
        }
        result[i]= element;
        return result;
    }

    public static String [] addElement(String [] array, String element){

        String [] result = new String[array.length + 1];

        int i  = 0;// thus we dont know the indexes, assign a variable i
        for (String each : array) {// in order to get the each element of the array, we use for each loop
            result[i++]=each;
        }
        result[i]= element;
        return result;
    }
}
