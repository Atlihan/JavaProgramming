package day10_NesdetIf;

public class GradeReport {
    public static void main(String[] args) {
        /*90~100
        core: 90~100: Excellent A
        80~89: Great B
        70~79: Good C
        60~69 : Passed D
        0~59 : Failed F
        */
        int score = 95;

        if(score >= 0 && score <= 100) { // if the score is valid; 5 possibilities: A B C D F
            if(score > 90) {
                System.out.println("Excellent");
            }else if (score>80) {
                System.out.println("Great");
            }else if (score > 70) {
                System.out.println("Good");
            }else if (score>60) {
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }

        } else{ //Score is not valid
            System.out.println("Invalid score");
        }
        System.out.println("================================");

        //we can assign a variable instead of each "print statement",  like "result"

        String result = ""; // temporary value

        if(score >= 0 && score <= 100) { // if the socre is valid; 5 possibilities: A B C D F
            if(score > 90) {
                result = "Excellent";
            }else if (score>80) {
                result = "Great";
            }else if (score > 70) {
                result = "Good";
            }else if (score>60) {
                result = "Passed";
            }else{
                result = "Failed";
            }

        } else{ //Score is not valid
            result = "Invalid score";
        }
        System.out.println(result);
    }
}
