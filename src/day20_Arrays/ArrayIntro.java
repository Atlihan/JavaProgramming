package day20_Arrays;

import java.util.Arrays;

public class ArrayIntro {

    public static void main(String[] args) {
// create a variable that isi capable of containing 5 names

        String [] myGroup = new String[5];
        myGroup[0] = "Neira";
        myGroup[1] = "Gunay";
        myGroup[2] = "Suat";
        myGroup[3] = "Myke";
        myGroup[4] = "John";

        System.out.println(Arrays.toString(myGroup));// Neira, Gunay, Suat, Myke, John
        System.out.println("=========================");

        //write a progrm with a variable including weekdays

        String [] days = {"Monday", "Tuesday","Wednesday", "Thursday","Friday", "Saturday", "Sunday"};
        //                      0       1           2       3               4          5        6
        int numbers = 5;

        System.out.println(Arrays.toString(days));

        if (numbers<1 || numbers>7){
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[numbers-1]);// Friday









    }
}
