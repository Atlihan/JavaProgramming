package day18_NestedLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {
        /* You are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                            username: Cydeo
                            password: WoodenSpoon

                Ask the user to enter their credentials.
                        If credentials are matched, your program should print "Logged in."
                        If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked."

Nested loop:  loop inside another loop (inner & outer loops)

        one iteration of the outer loop, executes all the iteration of the inner loop
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your user name : ");
        String u = scan.next();


        System.out.println("Enter your password : ");
        String p = scan.next();


        if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
            System.out.println("Logged in");
        }else{
            for (int i = 1; i < 4; i++) {// number of attempts is 3
                System.out.println("Incorrect password or username");
                System.out.println("Enter your user name");
                u = scan.next();

                System.out.println("Enter your pasword");
                p = scan.next();

                if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
                    System.out.println("Logged in");
                break;
                }

            }
            if (!(u.equals("Cydeo") && p.equals("WoodenSpoon")) ){
                System.err.println("Your account 's blocked, please contact with support team ");
            }
        }
        scan.close();

    }
}
