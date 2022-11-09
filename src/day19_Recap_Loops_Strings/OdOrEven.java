package day19_Recap_Loops_Strings;

import java.sql.SQLOutput;
import java.util.Scanner;

public class OdOrEven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number");
            int num1 = scan.nextInt();

            if (num1 % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }
            System.out.println("Would you like to enter another number? yes/no");
            String answer = scan.next().toLowerCase();

            if (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Invalid entry");
                System.exit(0);
            }

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you");
            }


        }
    }
}
