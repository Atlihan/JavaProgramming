package day20_Arrays;

public class MinimumNumberOfArray {

    public static void main(String[] args) {

        int [] numbers = {100, 500, 30, 40, 600};

        int  min = numbers [0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<min){// if there is an element in array smaller than initially assigned number (100) ;
                min = numbers[i];// every smaller number is assigned to min.
            }

        }
        System.out.println(min);

    }

}
