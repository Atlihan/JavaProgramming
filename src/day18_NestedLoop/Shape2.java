package day18_NestedLoop;

public class Shape2 {

    public static void main(String[] args) {

        for (int j = 0; j < 10; j++) {
            System.out.print("*");

            for (int i = 0; i <= j; i++) {
                System.out.print(" ");
            }
            System.out.println("*");

        }

    }
}
// Use a nested loop to print the following shape
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * * * *
//        * * * * * * *
//        * * * * * * * *
//        * * * * * * * * *
//        * * * * * * * * * *