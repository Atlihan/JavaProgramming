package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aaabcccdeefgggggijjjjjj";

        String [] arr = str.split("");// first we need to create a nin-primitive Array with split method
        // ATTENTION!! WE CAN NOT DIRECTLY CONVERT PRIMITIVE TO AAN ARRAY LIST

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));// then we convert that Array into an ArrayList via asList method

        System.out.println("list = " + list);//[a, a, a, b, c, c, c, d, e, e, f, g, g, g, g, g, i, j, j, j, j, j, j]

        String unique = "";

        for (String each : list) {
            int frequency = Collections.frequency(list, each);
            if (frequency == 1){
                unique += each;
            }
        }
        System.out.println("unique = " + unique);// bdfi


    }
}
