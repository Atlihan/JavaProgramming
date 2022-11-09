package day22_MultiDimensıonalArray;

import java.util.Arrays;

public class ReverseSecondWord {

    public static void main(String[] args) {

        /*
    2. Write a program that can reverse the second word of the sentence
			Ex: sentence = "I Love Java";
			output: I evoL Java
     */
        String sentence = "I Love Java";

        String[] words = sentence.split(" ");
        String reverse = "";

        for (int i = words[1].length() - 1; i >= 0; i--) {
            reverse += words[1].charAt(i);
        }
        System.out.println(reverse);// 1. first we need the print reverse of the word> evoL

       // 1 st Solution: sentence = sentence.replaceFirst(words[1], reverse); replaceFirst metod is the replacing the reverse version of the word
        // with original word

        // 2 nd Solution:

        words[1] = reverse;// 1 is the index no of the word "love". So the second word will replace the reversed one
        System.out.println(Arrays.toString(words));// 1. [I, evoL, Java]

        for (String word : words) {
            System.out.print(word+" ");// 2. I evoL Java


        }



    }
}
