package day11_Switch_Scanner;

public class NumberToWords {
    public static void main(String[] args) {

        int num = 7;
        String result = (num>=0 && num<=10)?//=> if Block=> Pre condition and after we have "multi branch if conditions" below:
                        (num==0)?"zero" :(num==1)?"one" :(num==2)?"Two" :(num==3)?"Three" :(num==4)?"Four"
                        :(num==5)? "Five" :(num==6)? "six" :(num==7)?"seven" :(num==8)?"eight" : "nine"
                    : "Invalid Number";
        System.out.println(result);

    }
}
// Write a program that can convert numbers 0~9 to words.
//NOTE: MUST use ternary
