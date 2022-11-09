package day20_Arrays;

public class AverageNumbers {

    public static void main(String[] args) {

        int [] numbers = {10, 20, 30, 40, 50, 60};// to find the average number we need to sum all numbers and then divide

        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = sum/ numbers.length;// if we want to decimal result then we assign sum as double
        System.out.println("average number : "+ average);
        }
    }


