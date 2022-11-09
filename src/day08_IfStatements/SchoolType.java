package day08_IfStatements;

import org.w3c.dom.ls.LSOutput;

public class SchoolType {

    public static void main(String[] args) {
        int num = 8;
        String grade;

        if (num == 1 && num == 5) {
            grade = "Elementary";
        } else if (num == 6 && num == 8) {
            grade = "Middle School";
        } else if (num == 9 && num == 12) {
            grade = "High School";
        }else if (num == 13 && num == 16) {
            grade = "College";
        }else  {
            grade = "Grad School";
        }
        System.out.println("Level is :" + grade);
    }


}
/*Given a number(byte) grade level determine and print which
school type someone is in.
grade level and types are:
1-5: Elementary school
6-8: Middle school
9-12: High school
13-16: College
17-18: Grad School
Assume that the given number is 1 ~ 18

 */