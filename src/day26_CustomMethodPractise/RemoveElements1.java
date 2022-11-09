package day26_CustomMethodPractise;

import java.util.Arrays;

public class RemoveElements1 {

    public static void main(String[] args) {

        int [] numbers = {100, 200, 300, 400, 500};
        numbers = removeElement(numbers, 1);

        System.out.println(Arrays.toString(numbers));// [100, 300, 400, 500]

    }
//  removes the INDEX from the array   {1,2,3,4}           2 (index number, not the element)
    public static int [] removeElement(int [] array, int index){

        if(index<0 || index >array.length-1){
            System.err.println("Invalid Index : "+ index);
            System.exit(0);
        }
        int [] result = new int[array.length-1];

        int j = 0; // the index of the new array\ not given array
        for (int i =0; i<array.length; i++) {

            if(i==index){
                continue;// means skip the given index not to be included in new array
            }
            result [j++] = array[i];
        }
        return result;
    }



}
// 2.1 Create a method that passes two parameters:
// an integer array and an integer index. the method removes the element at the given index of the array and returns the new array
//		Ex:
//						int[] arr = {10,20,30,40}
//						removeElement(arr, 2) ==> {10, 20, 40}
// 2.2 Create a method that passes two parametetrs: a double array and an integer index. the method removes the element at the given index of the array and returns the new array
// 2.3 Create a method that passes two parametetrs: a char array and an integer index. the method removes the element at the given index of the array and returns the new array
//2.4 Create a method that passes two parametetrs: a String array and an integer index. the method removes the element at the given index of the array and returns the new array