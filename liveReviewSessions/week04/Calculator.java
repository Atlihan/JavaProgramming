package week04;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // Get two  double numbers form user and we will get a char (
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two double numbers : ");

        double num1, num2, sum = input.nextDouble();
        char operator;
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        double result;

        System.out.println("Arithmetic operation you want (+,-,/,*))");
        operator = input.next().charAt(0);// to get Char with scanner we use String Manipulation.

        System.out.println("Is the first number bigger than second one?");
        boolean answer = input.nextBoolean();

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;// we have NestedIf condition
                if (answer) {
                    result = num1 - num2;
                } else {
                    if (answer) {
                        result = num2 - num1;
                       

                    }

                }


        }


    }
}
