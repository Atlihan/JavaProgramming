package day15_ForLoop;

public class ForLoopPractises {

    public static void main(String[] args) {
// write a statement between 15 to 45


        for (int i = 15; i <= 45; i++) {
            System.out.print(i + " ");
        }

        System.out.println("==========================");

        // 100.99 98 97 ....
        for (int i = 100; i >= 50; i--) {
            System.out.print(i + " ");

        }

        System.out.println("=============================");
        // print even numbers between 1~55 (2 4 6 8 10 .....

        for (int i = 1; i <= 55; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            System.out.println("===========================");

        }


    }
}


