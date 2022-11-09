package day20_Arrays;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        char [] alphabet = new char[26];
//                i     ch
        alphabet [0] = 'Z';
        alphabet [1] = 'Y';
        alphabet [2] = 'X';


      //  System.out.println(Arrays.toString(alphabet));// this prints whole ARRAY

      //  System.out.println(alphabet[0]);// This prints only the element in an ARRAY
        // in order to print each  element in the array one by one, wee have LOOP to do this automatically
        char ch = 'Z';
        for (int i = 0; i<alphabet.length; i++, ch--){
            alphabet[i] = ch;
        }
        //or
        /*
                for (char i = 0; j = 'Z'; i< alphabet.length; i++, j--) {
            alphabet[i] = j;

         */
        System.out.println( Arrays.toString(alphabet));
        }

    }
