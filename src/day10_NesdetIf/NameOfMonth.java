package day10_NesdetIf;

public class NameOfMonth {
    public static void main(String[] args) {

        int num = 15;

        if (num >= 1 && num <= 12) { // if the Number is valid
            if (num == 1) {
                System.out.println("Jan");
            } else if (num == 2) {
                System.out.println("Feb");
            } else if (num == 3) {
                System.out.println("Mar");
            } else if (num == 4) {
                System.out.println("Apr");
            } else if (num == 5) {
                System.out.println("May");
            } else if (num == 6) {
                System.out.println("Jun");
            } else if (num == 7) {
                System.out.println("Jul");
            } else if (num == 8) {
                System.out.println("Aug");
            } else if (num == 9) {
                System.out.println("Sep");
            } else if (num == 10) {
                System.out.println("Oct");
            } else if (num == 11) {
                System.out.println("Nov");
            } else if (num == 12) {
                System.out.println("Dec");
            }

        } else {//if the number is NOT Valid
            System.out.println("Invalid Number");
        }

        System.out.println("========================================");
        // Assigning a String ("result") instead of each "print statement"

        String result = ""; //Temp value
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

    }
}


