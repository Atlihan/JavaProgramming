package day20_Arrays;

public class MaxNumberOfArray {

    public static void main(String[] args) {

        int [] numbers = { 10, 5, 4, 20, 1, 0};
        int max = numbers [0];// 10 initialy we chose the firs index (0) num of the Array: 10

        for (int i = 0; i < numbers.length; i++) {// then he loop begins to compare initial max number with each num in array
            if (numbers [i]> max ){
                max = numbers[i]; // and then loop assigns the greater number instead of initial max
            }
        }
        System.out.println(max);

    }

}
