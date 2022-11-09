package day30_CustomClasses;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {

    public static void main(String[] args) {
// write a programme that can swap the firs and the last element of the ArrayList

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        Collections.swap(numbers, 0, numbers.size()-1);

        System.out.println(numbers);//[8, 2, 3, 4, 5, 6, 7, 1]

        System.out.println("----------------------");

        // write a programme that can move all zeros to the ;ast index of ArrayList

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0, 5,6,7));

        System.out.println(list); //[1, 0, 2, 0, 3, 0, 4, 0, 5, 6, 7]

        int size = list.size();

        list.removeAll(Arrays.asList(0) );
        System.out.println(list);//[1, 2, 3, 4, 5, 6, 7]

        int newSize = list.size();
        int totalNumOfZeros = size - newSize;
        System.out.println("totalNumOfZeros = " + totalNumOfZeros);//totalNumOfZeros = 4

        for (int i = 0; i < totalNumOfZeros; i++) {//
            list.add(0);// the number,  not index
        }
        System.out.println(list);// [1, 2, 3, 4, 5, 6, 7, 0, 0, 0, 0]

        System.out.println("----------------------");

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list2) {
            if (each !=0){
                result.add(each);
            }
        }

        for (Integer each : list2) {//[1, 2, 3, 4]
            if (each == 0){
                result.add(each);
            }
        }
        System.out.println(result);// [1, 2, 3, 4, 0, 0, 0, 0]

        System.out.println("------------------------------------");

        // write a programme that can extract the special characters, digits and letters and then stores them into separate Arrays

        String str = "ABCD23$%@#456EFG";

        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }

        ArrayList<Character> letters = new ArrayList<>( chars );// by using Collection type we can ad one arraylist into an other

        letters.removeIf(p-> !Character.isLetter(p));
        System.out.println("letters = " + letters);//[A, B, C, D, E, F, G]

        ArrayList<Character> digits = new ArrayList<>( chars );

        digits.removeIf(p->!Character.isDigit(p));
        System.out.println("digits = " + digits);//[2, 3, 4, 5, 6]

        ArrayList<Character> specialCharacters = new ArrayList<>( chars );

        specialCharacters.removeAll(letters);
        specialCharacters.removeAll(digits);
        //specialCharacters.removeIf(p-> Character.isLetterOrDigit(p)); or we can use removeif
        System.out.println("specialCharacters = " + specialCharacters);//[$, %, @, #]



    }

}
