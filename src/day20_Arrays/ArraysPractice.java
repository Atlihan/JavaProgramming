package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        // 10 20 50 70

        int [] numbers = {10, 20, 50, 70};

        System.out.println(Arrays.toString(numbers));

        System.out.println("============================");

        // create a varriable that can contain 5 elements

        int [] scores =  new int[5];
        System.out.println(Arrays.toString(scores));// result is [ 0 0 0 0 0 0]

        // but if we know the  scores like:

        scores[0] = 65;
        scores [scores.length-1] = 95;// tha last score
        scores[3] = 75;
        scores[2] = 55;
        scores[1] = 44;

        System.out.println(Arrays.toString(scores));// [65, 44, 55, 75, 95]

        System.out.println("==================");

        String [] months = { "January", "Feb", "Apr", "Mar", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Dec"};

        for (int i = 0; i < months.length; i++) {
            System.out.println( months[i]);
            // January
            //Feb
            //Apr
            //Mar
            //May
            //Jun
            //Jul
            //Aug
            //Sep
            //Oct
            //Dec
        }

    }
}
