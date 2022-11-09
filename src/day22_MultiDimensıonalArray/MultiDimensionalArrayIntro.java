package day22_MultiDimensıonalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {
        String [] group1 = { "John", "James", "Tom"};
        String [] group2 = { "John", "James", "Tom"};
        String [] group3 = { "John", "James", "Tom"};

        String [][] groups = new String[3][];// index 0, 1, 2
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

        System.out.println(Arrays.deepToString(groups));//[[John, James, Tom], [John, James, Tom], [John, James, Tom]]

        System.out.println("========================================");
        // Index of elements 0 1 2    0 1 2 3    0 1 2  3  4
        int [][] arr2D = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12}};
        // Index of arrays   0         1              2


        System.out.println( Arrays.deepToString(arr2D));// 1. to see the elements and arrays

        /// to print this array {4,5,6,7}
        System.out.println( Arrays.toString(arr2D[1]));// [4, 5, 6, 7]: to print every single dimensional array,
        // wee use toString method


// to get the element 11
        System.out.println(arr2D[2][3]);// 11: to get the single element from multidimensional array,
        // first wee need to get the single dimensional array


    }
}
/*
String [] group1 = {  }
String [] group2 = {  }
String [] group3 = {  }
 */
