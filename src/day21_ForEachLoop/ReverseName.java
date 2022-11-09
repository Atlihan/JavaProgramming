package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseName {

    public static void main(String[] args) {

        String[] names = {"Ali Atlihan", "Fatma Atlihan", "Hande Atlihan"};

        for (String each : names) {

            String reversed="";

            for (int i = each.length()-1; i >= 0; i--) {

                reversed+=each.charAt(i);
            }
            System.out.println(reversed);

        }
    }
}
