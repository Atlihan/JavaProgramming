package day11_Switch_Scanner;
/*

 a char variable named grade is given. Wite a program that if student gets grades:
            from 'A' to 'D' => "Passed"
			other wise => "Failed"
 */
public class Grade2 {
    public static void main(String[] args) {

        char ch = 'A';

        switch (ch){
            case 'A':
                System.out.println("Passed");
                break;
            case 'B':
                System.out.println("Passed");
                break;
            case 'C':
                System.out.println("Passed");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default :
                System.out.println("Invalid");

        }
    }
}
/*
OR=========> Instead of stating the same RESULT again and again, we can use :
char ch = 'A';
String result = "";

        switch (ch){
            case 'A': case 'B': case 'C': case 'D':
            result = Passed:
            break;

            case 'F':
            result = Failed:
            break;

            default :
                result ="Failed";
       }
               System.out.println(result);

 */


