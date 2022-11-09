package day16_ForLoop_StringPractises;

public class UniqueCaharacter {

    public static void main(String[] args) {
//write a program that returns the unique character of a string

        String str = "aaabccc";

        String result = "";

        for (int i = 0; i < str.length(); i++) {// i: index numbers of str (starting from 0)
            char ch = str.charAt(i);// each character of str
            if (str.indexOf(ch) == str.lastIndexOf(ch)){;// if the first and the last index of the character ise same then it is unique
                result += ch;
            }

        }
        System.out.println("result = " + result);// print statement must be given out of Loop lines

    }


}
