package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);

        System.out.println("enter your Full name");
        String fullName = scan.nextLine();

        System.out.println("Enter Building Number");
        String building = scan.next();
        scan.nextLine();

        System.out.println("Enter street name");
        String street = scan.nextLine();

        System.out.println("Enter City");
        String city = scan.nextLine();

        System.out.println("Enter state");
        String state = scan.next();

        System.out.println("Enter Zip code");
        String zip = scan.next();

        System.out.println("fullName = " + fullName);
        System.out.println("zip = " + zip);
        System.out.println("building = " + building);
        System.out.println("street = " + street);
        System.out.println("city = " + city);
        System.out.println("zip = " + zip);
        System.out.println("state = " + state);

        scan.close();

    }
}
/*
1-enter your Full name (next.line)
2-Enter Building Number (next.Int)
3- Enter street name (next.line)
4- Enter City (next.line)
5-Enter state next (next () )
6-Enter Zip coder (next ())

 */
