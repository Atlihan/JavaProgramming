package day21_ForEachLoop;

public class MaxNumber {

    public static void main(String[] args) {

        int [] numbers = { 10, 5, 4, 20, 1, 0};
        int max = numbers [0];// 10 initially we chose the firs index (0) num of the Array: 10

       /* for (int i = 0; i < numbers.length;
       i++) {// then he loop begins to compare initial max number with each num in array
            if (numbers [i]> max ){
                max = numbers[i]; // and then loop assigns the greater number instead of initial max
            }
        }

        */
        for (int number : numbers) {
            if (number > max){
                max = number;
            }
        }
        System.out.println(max);
    }
}
