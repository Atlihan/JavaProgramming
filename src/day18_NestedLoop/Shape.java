package day18_NestedLoop;

public class Shape {

    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {
            System.out.print("#");// first #

            for (int j = 1; j <= i; j++) {// j is for number of space
                System.out.print(" ");
            }
            System.out.println("#");// second #
        }

    }


}

//for (int i = 1; i <= 7; i++) {
//            System.out.print("#");
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" ");
//
//            }
//            System.out.println("#");
//        }

