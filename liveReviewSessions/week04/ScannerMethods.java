package week04;

import java.util.Scanner;

public class ScannerMethods {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // new Scanner(System.in): Object
        int x = 5;
        System.out.println("Enter an integer number: ");

        int y = scan.nextInt();

        int sum = x+y;

        System.out.println("sum :" + sum);


    }
}

