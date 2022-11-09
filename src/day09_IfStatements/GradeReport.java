package day09_IfStatements;

public class GradeReport {

    public static void main(String[] args) {
        int score = 90;
        char grade;
        if (score>=90) {
            grade = 'A';
        }else if(score >=80){
            grade = 'B';
        }else if(score >= 70) {
            grade = 'C';
        }else if(score>=60) {
            grade = 'D';
        }else {//score<60
            grade = 'F';
        }
            System.out.println("Grade is : "+grade);

        }

    }

