package week06;

import java.util.Scanner;

public class FibonacciTask {

    public static void main(String[] args) {

        // write a program that Fibonacci series of n terms
        //         where n is declared by user :
        //         0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......
        /* number of term
        0   1   2   3    4   5
        n1  n2  sum
        0   1    1
        1   1    2
        1   2    3
        2   3    5
        3   5    8
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the term number for Fibonacci Series ? : ");

        int n = scanner.nextInt();  // 6
        int num1 = 0;
        int num2 = 1;
        int sum ;

        // Variables are containers that hod value

        String series = ""+num1+" "+num2+" ";

        for (int i = 2; i<=n ; i++){   // if n=6, it will do 5 times iteration
            sum = num1+num2;
            series +=sum+" ";
            num1 = num2;
            num2 = sum;
        }
        System.out.println("series = " + series);
        System.out.println("final number in the squence = " + num2);

    }
}
