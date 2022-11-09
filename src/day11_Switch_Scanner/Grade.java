package day11_Switch_Scanner;

public class Grade {

    public static void main(String[] args) {
         char grade = 'G';

         switch (grade){
             case 'A':
                 System.out.println("Excellent");
                 break;
             case 'B':
                 System.out.println("great job");
                 break;
             case 'C':
                 System.out.println("Good");
                 break;
             case 'D':
                 System.out.println("passed");
                 break;
             case 'F':
                 System.out.println("Failed");
                 break;
             default:
                 System.out.println("Invalid");

         }
    }
}
/* OR we can assign a String (result):
switch (grade){

string result = " ";

             case 'A':
                 result = "Excellent";
                 break;
             case 'B':
                 result ="great job";
                 break;
             case 'C':
                 result ="Good";
                 break;
             case 'D':
                 result ="passed";
                 break;
             case 'F':
                 result ="Failed";
                 break;
             default:
                 result ="Invalid";

                  System.out.println(result);


 */
/*
 a char variable named grade is given. use switch statement to print the following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			other wise: invalid

 */