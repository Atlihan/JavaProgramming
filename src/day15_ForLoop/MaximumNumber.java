package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");


        int max = -2147483648;// !!!! In order to find the maximum number we should assign the SMALLEST INTEGER in JAVA
        for (int i = 0; i < 5; i++) {
            int num = scan.nextInt();
            if(num>max){// if we enter 1, it will compare it with (-214...), so the max num will be the entered number
                max = num;
            }
            System.out.println("max = " + max);

        }

    }
}
// ask the user enter a number 5 times and return the max number
