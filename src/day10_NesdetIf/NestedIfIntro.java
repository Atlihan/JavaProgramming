package day10_NesdetIf;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 400;

        if (score >= 0 && score <= 100) { // if score is valid
            if (score >= 60) {// if student passed
                System.out.println("Passed");
            } else {//if the student failed
                System.out.println("Failed");
            }

        } else { // if score is invalid
            System.out.println(" invalid score");
        }
        System.out.println("======================================");

        int age = 25;
        boolean hasId = true;

        if (hasId) {// must have an ID
            if (age >= 21) { // persn is older than 21
                System.out.println("Eligible to buy alcohol");
            } else {// perosn is less than 21
                System.out.println("Not Eligible to buy alcohol");
            }
        } else {//
            System.out.println("You must have an Id");
        }
        System.out.println("===================================");

        int num = -1;

        if (num >= 1 && num <= 7) {
            if (num == 1) {
                System.out.println("Monday");
            } else if (num == 2) {
                System.out.println("Tuesday");
            } else if (num == 3) {
                System.out.println("Wednesday");
            } else if (num == 4) {
                System.out.println("Thursday");
            } else if (num == 5) {
                System.out.println("Friday");
            } else if (num == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }
        } else { //the number is NOT valid
            System.out.println("Invalid Number");

        }
    }
}