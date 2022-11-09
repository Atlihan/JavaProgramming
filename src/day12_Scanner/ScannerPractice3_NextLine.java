package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your fullname");
        String fullName = scan.nextLine();

        System.out.println("enter your programming language");
        String programming = scan.nextLine();

        System.out.println("Enter your age");
        int age = scan.nextInt();
        scan.nextLine();/*=to call the ENTER left in scanner/ Because we used next.(int) for age so that we need to take
        out the ENTER left in the memory of Scanner*/

        System.out.println("Enter your School Name");
        String school = scan.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("school = " + school);


    }
}
