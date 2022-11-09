package day16_ForLoop_StringPractises;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        // write a programm that reverse : Wooden Spoon
        /*
        result + = charAt(11)
        result + = charAt(10)
        result + = charAt(0)
        .....// insetad of assigning 11 line==>
         */
        String str = "Wooden Spoon";
        String result= "";
        for(int i = str.length()-1; i >= 0; i--){// i : index number of str
            result += str.charAt(i);// if we want to call the character, we need charAt and index number
            // + : is for adding each caharacter in to the result/
        }
        System.out.println("result = " + result);// noopS nedooW
    }
}
