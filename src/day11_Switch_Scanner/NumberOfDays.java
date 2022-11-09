package day11_Switch_Scanner;
/*
Number of days:
28 days: 2
30 Days: 4 6 9 11
31 days : 1 3 5 7 8 10 12
*/
public class NumberOfDays {
    public static void main(String[] args) {

        int number = 2;
        int year = 2000;

        if(number>=1&& number<=12) {//number 1~12
            switch (number) {
                case 2:
                    if(year %4 == 0){
                        System.out.println("29 Days");
                    }else {
                        System.out.println("28 days");
                    }
                    break;

                case 4: case 6: case 9: case 11:// as we can NOT use boolean in switch,
                    // instead we can put in order case bocks back to back
                    System.out.println("30 days");
                    break;

                default:// 1 3 5 7 8 10 12
                    System.out.println("31 days");
            }
        }else{
            System.out.println("Invalid Number");

        }

    }
}
/* OR we can assign RESULT:

String result = " ";

if(number>=1&& number<=12) {//number 1~12
            switch (number) {
                case 2:
                    if(year %4 == 0){
                        result = (year %4 == 0)? "29 Days": "28 days"; // Ternaries
                         break;

                case 4: case 6: case 9: case 11:
                         result = "30 days";
                         break;

                default:// 1 3 5 7 8 10 12
                           result = "31 days";

         }else{
                        result = "Invalid Number";

        }

    }
}




 */