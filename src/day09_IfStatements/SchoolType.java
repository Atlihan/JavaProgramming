package day09_IfStatements;

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
            }else {
                grade = "Grad School";
            } System.out.println("Grade is : " +grade);
        }

    }
