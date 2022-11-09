package week08;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        int [] codes  = new int[8];

        codes [0] = 100;
        codes [2] = 204;
        codes [codes.length-1] = 500;

        for (int i = 0; i < codes.length; i++) {
           ; //or
            System.out.println(Arrays.toString(codes));

        }

        System.out.println("====================");



    }
}
