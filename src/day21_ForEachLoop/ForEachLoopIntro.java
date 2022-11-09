package day21_ForEachLoop;

public class ForEachLoopIntro {

    public static void main(String[] args) {

        int [] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) {
            int eachElement = numbers[i];
            System.out.println(eachElement);

        }// instead of this we can use for each loop
        System.out.println("=========================");

        for ( int eachElement : numbers){
            System.out.println(eachElement);

        }

    }

}
