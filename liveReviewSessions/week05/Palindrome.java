package week05;

public class Palindrome {

    public static void main(String[] args) {

        String word = "Madam";// how can I reverse this word in Java?
        //            01234

        String result = "";
        result += word.charAt(4);
        result += word.charAt(3);
        result += word.charAt(2);
        result += word.charAt(1);
        result += word.charAt(0);


        System.out.println("result = " + result);

        System.out.println("=======================");
        if(word.equals(result)) {
            System.out.println("They are Palindrome");
        }


        }

    }

