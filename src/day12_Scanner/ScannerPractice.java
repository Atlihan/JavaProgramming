package day12_Scanner;
//import java.util.*; wild import: imports everything from the package
import java.util.Scanner; // regular import:

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7");

        int num = scan.nextInt();
        String result = "";
         if(num >= 1 && num <= 7) {// we can use "Ternaries" instead of "multi branch If"

             result = (num == 1)? "Monday" :(num == 2)?"Tuesday" :(num == 3)?"Wednesday"
                     :(num == 4)?"Thursday" :(num == 5)?"Friday" :(num == 6)?"Saturday" : "Sunday";
         }else{
             result = "Invalid Number";

    }
        System.out.println(result);
         scan.close();

    }


}
