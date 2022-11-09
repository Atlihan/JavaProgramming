package day15_ForLoop;

import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {

        /*write a profram that ask user to enter first and last name
        and then print full name n regular format
        first name: cyDEO
        last name: SCHOOL
 */
        String firstName = "cyDEO";
        String lastName = "SCHOOL";

       firstName =  firstName.substring(0,1).toUpperCase()+ firstName.substring(1).toLowerCase();
       lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

      /* or: firstName = (""+ firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase();

       */

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        String fullName = firstName + " " + lastName;

        System.out.println("fullName = " + fullName);


    }
}
