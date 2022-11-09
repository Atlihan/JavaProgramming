package day25_CustomMethod_Overloading;


import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str = " Java Programming";

        StringUtility.reverse(str);

        System.out.println("----------------------");

        String str3 = "aaaabbbbbccc";

        String numDup = StringUtility.removeDuplicates(str3);
        System.out.println("numDup = " + numDup);

    }
}
