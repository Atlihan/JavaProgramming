package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {

        int number = 5;
        switch (number){//1,2,3,4,5,6,7 == Switch statement is only used for the data if it is EQUAL to other data
            case 1:
                System.out.println("Monday");
                break;//exits the switch after executing the case block
            case 2:
                System.out.println("Tuesday");
                break;//exits the switch after executing the case block
            case 3:
                System.out.println("Wednesday");
                break;//exits the switch after executing the case block
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:// is not mandatory but if you wish to add/
                System.out.println("Invalid Number");
                break;// if default is at the very end, there is no need to add 'break'\ because we have } at the end

        }

    }

}
