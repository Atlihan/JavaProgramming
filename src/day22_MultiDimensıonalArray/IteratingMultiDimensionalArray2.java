package day22_MultiDimensıonalArray;

public class IteratingMultiDimensionalArray2 {

    public static void main(String[] args) {// task 1: write reverse version of every single dimensional array

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {9, 10, 11, 12}};

        for (int i = arr2D.length - 1; i >= 0; i--) {// i:index of one dimensional array from last index
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("=========================================");
        /*
               task 2:
                3,2,1
                 7,6,5,4
                 12,11,10,9
                */
        for (int i = 0; i < arr2D.length; i++) {//i: index no of each 1D array

            for (int j = arr2D[i].length - 1; j >= 0; j--) {//j: index of each element
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("================================");
        /*
 task: 3
          12, 11, 10,  9
         7, 6,5,4
         3,2,1
 */
        for (int i = arr2D.length - 1; i >= 0; i--) {

            for (int j = arr2D[i].length - 1; j >= 0; j--) {

                System.out.print(arr2D[i][j]+" ");

            }
            System.out.println();

        }

    }

}







