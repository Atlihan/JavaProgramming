package day29_ArrayListContinue;

import java.util.ArrayList;

public class MaxMinAveragae {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        System.out.println(list);

        int max = list.get(0);
        int min = list.get(0);
        int sum = 0;


        for (Integer each : list) {
            if (each > max){
                max = each;
            }
            
            if (each < min){
                each = min;
            }

            sum += each;
        }

        double average = (double) sum / list.size();// in order to get exact result, we need to make one of the double
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("average = " + average);

    }

}
