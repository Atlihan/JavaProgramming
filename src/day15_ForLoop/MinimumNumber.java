package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int min = 2147483647;//any number that user enter should be less than this number
        System.out.println("Enter a number");

        for (int i = 10; i < 15; i++) {// suppose that we will start with 10 so that other four will be less than 15
            int num = scan.nextInt();
            if(num<min){
                min = num;
                System.out.println("min = " + min);
            }

        }

    }
}
// sk the user enter a number 5 times and return the min number
