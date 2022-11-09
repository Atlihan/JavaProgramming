package day22_MultiDimensıonalArray;

import java.util.Arrays;

public class ReverseSentence {

    public static void main(String[] args) {

        // Write a program that can reverse a sentence = "Today is a good day to learn Java";
        //			output:Java learn to day good a is Today

        String sentence = "Today is a good day to learn Java";

       String [] words =  sentence.split(" ");// split method is used for getting each word one by one
        System.out.println(Arrays.toString(words));// first wee need to have an array including each word [Today, is, a, good, day, to, learn, Java]

// and then we need to iterate the array starting with reverse order
       String reversedSentence="";

        for (int i = words.length - 1; i >= 0; i--) {//for the reverse order of the sentence we use for loop
            reversedSentence+=words[i] + " ";
        }
        System.out.println(reversedSentence);


    }
}
