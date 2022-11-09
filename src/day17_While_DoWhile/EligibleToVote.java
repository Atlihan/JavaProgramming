package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = scan.nextInt();

        while (!(age >=1 && age<=120)){// while the age is invalid, the loop gets execute, but until entering a valid age,
            System.out.println("Invalid entry, please re-enter : ");
            age= scan.nextInt();// while loop is the statement that repeating  statement unknown times/

            System.out.println("Are you a US citizen ? yes/no");
            String answer = scan.next().toLowerCase();

            while((answer.equals("yes") || answer.equals("no") )){
                System.err.println("Invalid entry, please re-enter");

            }
            /*if(age>=18 && answer.equals("yes")){      // This statement repeates ONLY 1 TIME. Instead we use WHILE
                System.out.println("You are eligible to vote");
            }else{
                System.out.println("You are no eligible to vote");

             */
            }

        }

    }

