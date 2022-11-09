package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

        oddOrEven(10);// without argument (10) task does not complete

        System.out.println("===================");

        ageOfPerson(1950);

        System.out.println("============");
        printNumbers(42, 85);
    }

    // create a function that can check f a number is even or odd

    public static void oddOrEven(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is even number");// 10 is even number
        } else {
            System.out.println(number + " is odd number");

        }
    }

    // create a  function that can display the age of the person

    public static void ageOfPerson(int birthYear) {

        int age = 2022 - birthYear;
        System.out.println("Your age is : " + age);//Your age is : 72
    }

    // print  all numbers between X and Y
    public static void printNumbers(int x, int y) {

        System.out.print(" The numbers between "+ x + " and "+ y + " are : ");
        for (int i = x+1; i < y; i++) {
            System.out.print(i+", ");// The numbers between 42 and 85 are : 43, 44, 45, 46,
        }
        System.out.println();
        }

    }



