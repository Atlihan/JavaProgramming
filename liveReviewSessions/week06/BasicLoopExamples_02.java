package week06;

public class BasicLoopExamples_02 {

    public static void main(String[] args) {

        /*
        write ap program that d'splays even numbers between 5 and 50
        How many numbers?
         */
        int countOfEvens = 0;

        for (int i = 5; i <= 50; i++) {
            if((i%2) == 0){
                ++countOfEvens;
            }
        }
        System.out.println("countOfEvens = " + countOfEvens);

    }
}
