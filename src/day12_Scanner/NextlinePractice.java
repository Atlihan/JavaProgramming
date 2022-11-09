package day12_Scanner;

import java.util.Scanner;

public class NextlinePractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt();
        scan.nextLine();// in order to call ENTER left in the memory of the scanner and make user to enter full name

        System.out.println("Enter your full name");
        String name = scan.nextLine();

        System.out.println("age = " + age);
        System.out.println("name = " + name);

        scan.close();

    }

}
