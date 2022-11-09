package day41_Exceptions;

import java.io.FileInputStream;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Test started");


        System.out.println("Try Block");

        try {
            System.out.println(9 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Catch Block");
            System.out.println("Arithmetic  Exception was occurred");
        }

        System.out.println("test completed");

        System.out.println("---------------------------------");

        System.out.println("Test2 has started");


        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println(numbers[200]);
            System.out.println("try block");
        } catch (RuntimeException e) {
            //   System.out.println("Catch Block");
            //  System.out.println("Runtime Exception was occurred");

            // if we wanna full details of exception we can use printStackTrace method
            //  e.printStackTrace();

            // or if we wanna get only brief info we use getMessage method
            System.out.println(e.getMessage());//Index 200 out of bounds for length 5
        }
        System.out.println("Test 2 completed");

        System.out.println("-------------------------");

        System.out.println("Test3 started");

        try {
            System.out.println("Cydeo".substring(2, 0));

        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Test4 started");

        System.out.println("--------------------------------");

        System.out.println("Hello");

        try {
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Cydeo");

        System.out.println("-------------------------------------");

    }
}
