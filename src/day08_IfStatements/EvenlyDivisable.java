package day08_IfStatements;
/* Create a class named Evenly Divisible and write a program that can identify given number is:
evenly divisible by 2, 3 ,5
number  = 65
output = 65 is evenly divisible by 2 : false
        65 is evenly divisible by 3 : false
        65 is evenly divisible by 5 : true
 */
public class EvenlyDivisable {
    public static void main(String[] args) {

        byte number = 65;

        boolean divisibleBy2 = number % 2 == 0;
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;

        System.out.println(number + " is divisible by 2 is : " + divisibleBy2);
        System.out.println(number + " is divisible by 3 is : " + divisibleBy3);
        System.out.println(number + " is diviisble by 5 is : " + divisibleBy5);



    }
}
