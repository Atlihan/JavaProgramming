package day17_While_DoWhile;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        // write a program that can return the frequency of a charavter from a string

        String str = "AAABBBC";
         char ch = 'A';
         int frequency = 0;

        for (int i = 0; i < str.length(); i++) {

            char eachCharacter = str.charAt(i);
            if(ch ==eachCharacter){// if given ch (A) matches with eachCharacter then char appeared in string
                frequency++;

            }
        }
        System.out.println("frequency = " + frequency);

    }
}
