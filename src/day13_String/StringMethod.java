package day13_String;

public class StringMethod {

    public static void main(String[] args) {

        String word = "Cydeo";

        char thirdChar = word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);


        System.out.println("====================================");

        String s1 = " Batch 25 is the best batch.";
        
        int totalCharas = s1.length();
        System.out.println("totalCharas = " + totalCharas);

        // if we want to call the last caharacter:

        char lastChar = s1.charAt(s1.length() -1);// or; char lastChar = s1.charAt(totalChars -1)

        System.out.println("=======================================");

        String str = "wooden spoon";
        str = str.toUpperCase();

        System.out.println("str = " + str);

        //Today is a great day to learn Java.

        String sentence = "Today is a great day to learn Java.";

        sentence = sentence.toUpperCase();/* Once we assign a variable for a String (sentence),
        this method does not modify the object. So we need to assigh the object again. ( sentence = sentence)
        */

        System.out.println("sentence = " + sentence);


    }
}
