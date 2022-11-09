package day10_NesdetIf;

public class TernariesWithNested {

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
        System.out.println("=================================");

        String result = (score >= 0 && score <= 100)? (score >= 60)? "Passed" : "Failed" : "Invalid Score";
        System.out.println(result);

        System.out.println("==================================");
        int num = 8;

        if(num >= 1 && num <=12) {
            if (num == 1) {
                result = "Jan";
            } else if (num == 2) {
                result = " Feb";
            } else if (num == 3) {
                result = "Mar";
            } else if (num == 5) {
                result = "Apr";
            } else if (num == 6) {
                result = "May";
            } else if (num == 7) {
                result = "Jun";
            } else if (num == 8) {
                result = "Jul";
            } else if (num == 9) {
                result = "Sep";
            } else if (num == 10) {
                result = "Oct";
            } else if (num == 11) {
                result = "Nov";
            } else {
                result = "Dec";
            }
        }else{
            result = "Invalid Number";
        }
        System.out.println("result :" + result);
        System.out.println("=======================================");
        String name;

        String result2 = (num >= 1 && num <=12)? (num == 1)? "Jan" :(num == 2)? "Feb" : (num == 3)? "Mar" : (num==4)? "Apr"
                :(num==5)? "May" :(num==6)? "Jun" :(num ==7) ? "Jul" :(num == 8)? "Aug" :(num == 9)? "Sep"
                :(num == 10)? "Oct" :(num == 11)? "Nov" : "Dec" : "Invalid Number";
        System.out.println(result2);
    }
}
