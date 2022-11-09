package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};

        int [] result = new int[arr.length];

        int j = 0;

        for (int i = arr.length -1; i>= 0; i--, j++) {
            result[j] = arr[i];
        }
        System.out.println(Arrays.toString(result));//[5, 4, 3, 2, 1]

        System.out.println("---------------------------");

        ArrayList<Integer> List  = new ArrayList<>();

        List.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        ArrayList<Integer> reversedList = new ArrayList<>();

        for (int i = List.size() -1; i >=0; i--) {
            int each = List.get(i);// then we get each element by using index numbers from the last index to '0' from the List
            reversedList.add(each);// after that, we add each element into the new list starting from index 0
        }
        System.out.println("reversedList = " + reversedList);// [9, 8, 7, 6, 5, 4, 3, 2, 1]
    }
}
