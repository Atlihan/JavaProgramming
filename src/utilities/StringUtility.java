package utilities;

import java.util.Arrays;

public class StringUtility {

    public static void main(String[] args) {

        String str = " Java";
        printEachChar(str);

        System.out.println(" =============");

        String reverse = reverse(str);
        System.out.println("reverse = " + reverse);

        System.out.println("==============");

        isPalindrome(str);

        System.out.println("---------------");

        String str1 = "abc";
        String str2 = "bca";

        boolean anagram = isAnagram(str1,str2);
        System.out.println(anagram);

        System.out.println("------------------");

        String str3 = "aaaabbbbbccc";

        str3 = removeDuplicates(str3);
        System.out.println("str3 = " + str3);

    }

    // print each character of the Str
    public static void printEachChar(String str) {

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }
    }

    //   reverse a string and return the reverse string
    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    // checks the given string is palindrome or not. to do this\ we need to reverse first
    public static boolean isPalindrome(String str) {
    return reverse(str).equalsIgnoreCase(str);

    }
    //checks the gıven String is anagram
    public static boolean isAnagram(String str1, String str2){
        // the way to compare two string is using charArray and to sort them via Array.sort method
        char[] ch1 = str1.toCharArray();
        char[]ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
// removes the duplicates from given string, returns String..."aaaabbbbbccc"
    public static String removeDuplicates(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);//

            if(!result.contains(""+each)){
                result+= each;
            }
        }
        return result;
    }
}
