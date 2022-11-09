package day01_JavaIntro;

import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str = "Woodden Spoon";

        StringUtility.printEachChar(str);

        System.out.println(" =============");

        String str2 = "Woodden Spoon";
        String reverse = StringUtility.reverse(str2);
        System.out.println("reverse = " + reverse);

        System.out.println("=============");

        String word = "Civic";

        boolean Palindrome = StringUtility.isPalindrome(word);
        System.out.println("Palindrome = " + Palindrome);

        System.out.println("------------------------");

        String[] names = {"Anna", "Bob", "james"};
        int count = 0;

        for (String each : names) {
            if (StringUtility.isPalindrome(each)) {
                count++;
            }
        }
        System.out.println(count);

    }

}

