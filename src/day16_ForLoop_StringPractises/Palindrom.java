package day16_ForLoop_StringPractises;

public class Palindrom {

    public static void main(String[] args) {

        String word = "Level";
        String reversed = "";

        for (int i = word.length()-1; i>= 0; i--) {
            reversed += word.charAt(i);
            
        }
        boolean isPalindrome = word.equalsIgnoreCase(reversed);
        System.out.println("isPalindrome = " + isPalindrome);;


    }
}
