package day15_ForLoop;

import day12_Scanner.ScannerPractice3_NextLine;

import java.util.Scanner;

public class SumOfNumbers {//// find sum of numbers between 1 and 100

    public static void main(String[] args) {
        
        int sum = 0;

        for (int i = 0; i < 101; i++) {// i: 1,2,3,4,5....100
            sum += i;// additiion assigmment operator: get every single numbers in to addition : 1+2+3+4...
            System.out.println(sum);
        }
        System.out.println("-------------------------------");


        // enter the same number 5 times and return the sum

        int total = 0;

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number : ");

        for (int i = 0; i < 5; i++) {
            total += scan.nextInt();
            System.out.println("total = " + total);;
        }

    }
}

