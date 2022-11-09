package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;
        boolean aIsMedianNumber = (a > b && a < c) || (a > c && a < b);
        boolean bIsMedianNumber = (b > a && b < c) || (b < a && b > c);
        boolean cIsMedianNumber = !aIsMedianNumber && !bIsMedianNumber;


        if(aIsMedianNumber){
            System.out.println(a + " is the median number");
        }

        if(bIsMedianNumber) {
            System.out.println(b + " is the median number");
        }

        if(cIsMedianNumber) {
            System.out.println(c+ " is the median number");
        }
    }
}

/* write a program that can find the median number between DIFFERENT given numbers below:
a = 10, b = 15 = c = 20

Possibility #1 = a is med number
Possibility #2 = b is med number
Possibility #3 = c is med number

 */

