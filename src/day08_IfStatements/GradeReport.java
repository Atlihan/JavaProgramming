package day08_IfStatements;

import java.sql.SQLOutput;

public class GradeReport {

    public static void main(String[] args) {
        int score = 85;
        boolean a = score >= 90 && score <= 100; //false
        boolean b = score >= 80 && score <= 89; //true
        //bolean b = score >= 80 && score !a
        boolean c = score >= 70 && score <= 79; //false
        //boolean c = !a && !b && score >=70
        boolean d = score >= 60 && score<= 69; //false
        boolean f = score >= 0 && score <=59; //false
        //bolean f = !a && !b && !c && !d

        if(a) {//If the Student made an A
            System.out.println("Excellent");
        }
        if(b) {//If the Student made a B
            System.out.println("Great");
        }
        if(c) {//If the student made a C
            System.out.println("Good");
        }
        if(d) {//If the student made a D

            System.out.println("Passed");
        }

        if(f) {//If the student made an F

            System.out.println("Failed");
        }

    }
}
/*
score: 90~100: Excellent A
        80~89: Great B
        70~79: Good C
        60~69 : Passed D
        0~59 : Failed F


 */