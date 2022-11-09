package day08_IfStatements;
/* Create a class named IdentifyNumber and write a program that if given number is

Ex: number  = 200

output= 00 is positive number: true
200 is negative number: false
200 is zero: false

 */
public class IdentifyNumber {
    public static void main(String[] args) {

        int number = 200;
        boolean numberIsPositive = number>0;
        boolean numberIsNegative = number<0;
        boolean numberIsZero = number == 0;

        System.out.println(number+ " is positive number: " +numberIsPositive);
        System.out.println(number+ " is negative number: " +numberIsNegative);
        System.out.println(number+ " is zero: " +numberIsZero);
    }
}
