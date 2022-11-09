package day22_MultiDimensıonalArray;

import java.util.Arrays;

public class MultiDimensionalArray2 {

    public static void main(String[] args) {

        int [] arr1 = {1,2,3};
        int [] arr2 = {4,5,6};
        int [] arr3 = {7,8,9};

        int [][] arr2D = { {1,2,3}, {4,5,6},{7,8,9} };

        // 3 dimensional array 2 dimensional arrayS

        //                        0         1       2             0         1       2   index no of 1d arrays
        int [][][] arr3D = { { {1,2,3}, {4,5,6},{7,8,9} } , { {10,20,30}, {40,50,60},{70,80,90} } };
        //                                0                                   1         index of 2d arrays
        // [index of 2d arrays] [index of 1d arrays] [index of elements]
        // any 3 dimensional array can contain 2 dimensional arrays as much as we want.

        System.out.println(Arrays.deepToString(arr3D));
        //[[[1, 2, 3], [4, 5, 6], [7, 8, 9]], [[10, 20, 30], [40, 50, 60], [70, 80, 90]]]

        // in order return  any of 2d arrays from 3d array: { {10,20,30}, {40,50,60},{70,80,90} }
        System.out.println(Arrays.deepToString(arr3D [1]));

        // in order to get the single dimensional array:






    }
}
