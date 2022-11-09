package day21_ForEachLoop;

public class ForEachLoopPractice {

    public static void main(String[] args) {
// how to get to first and last characters of each element in the array
        String[] words = { "Java Programming", "Cydeo School", "Wooden Spoon"};

        for ( String each : words){
            // for the first character we need chatAt(); for the last: lenght-1
            System.out.println(each.charAt(0)+""+ each.charAt( each.length()-1));
        }// we also add " " to get the character to get the string\ otherwise we have an addition result,

    }


}
