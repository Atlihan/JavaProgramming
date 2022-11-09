package day22_MultiDimensıonalArray;

import java.util.Arrays;

public class IteratingMultiDimansionalArray {

    public static void main(String[] args) {

        // Index of elements 0 1 2    0 1 2 3    0 1 2  3  4
        int [][] arr2D = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12}};
        // Index of arrays   0         1              2

        for (int i = 0; i < arr2D.length; i++) { // i:  index no of each single dimensional ARRAY

           // System.out.println(Arrays.toString(arr2D[i]));// to have each single dimensional array
            /*
            [1, 2, 3]
            [4, 5, 6, 7]
            [8, 9, 10, 11, 12]
             */
            for (int j = 0; j < arr2D[i].length; j++) {// j: for the index no of each ELEMENT
                System.out.print(arr2D[i][j]+" ");// in order to print each element in every single array, wee need the index no of each one dimensional array
            }
            System.out.println();// this print statement is for seperate line, after getting each elements from  each array

        }

    }
}
