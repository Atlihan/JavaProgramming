package week05;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WebAddress {

    public static void main(String[] args) {

        // create a scanner to get user input.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a valid web site: such as www.amazon.com");

        String userEntry = scanner.next();
        // www.amazon.com
        int indexOfFirstDot = userEntry.indexOf('.');
        int indexOfSecondDot = userEntry.lastIndexOf('.');

        String beginningOfUrl = userEntry.substring(0, indexOfFirstDot);
        String endingOfUrl = userEntry.substring(indexOfSecondDot+1);

        boolean isValid = beginningOfUrl.equalsIgnoreCase("www") &&
                endingOfUrl.equals("gov") || endingOfUrl.equals("com") || endingOfUrl.equals("edu");

        if(isValid)
            System.out.println("Valid websitse");
        else
            System.out.println("Invalid website");


    }
}
