package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "acdb";
        String str2 = "dbca";

        // write program that can check if two strings are build out same characters

        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println();

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean anagram = Arrays.equals(ch1, ch2);

        System.out.println("anagram = " + anagram);

        System.out.println("============================");

        String email = "Woodenspoon@cydeo.com";

        String [] arr = email.split("@");
        System.out.println(Arrays.toString(arr));

        System.out.println("==============================");

        String s = "Today is nice day. Today is Monday. Today we learn java.";

        String [] sentence = s.split("\\. ");



    }
}