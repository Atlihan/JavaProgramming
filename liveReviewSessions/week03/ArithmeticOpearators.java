package week03;

public class ArithmeticOpearators {

    public static void main(String[] args) {

        /* int/int = int
        int/double = double
        other castings always result in double/

         */
        System.out.println(10/3);// = 3
        System.out.println(10/3.0); // = 3.3333333333333335
        System.out.println(10.0/3);// = 3.3333333333333335

        System.out.println("======================================");
        int leftover = 17%3;
        int outcome = 12 + 6 / 3;

        System.out.println(outcome);// 14
        System.out.println("leftover = " + leftover);// 2

        outcome = 4 + 17 % 2 - 1;
        System.out.println("outcome = " + outcome);// 4 + (1) - 1 = 4

        outcome = 3+ 4*4+5*(4+3)-1;// 3 + 16 + 35 -1  = 53
        System.out.println("outcome = " + outcome);


        int num1 = 46;
        int num2 = 90;
        int sum = num1+num2;

        double tempInCelcius, tempInFahrenheit;
        tempInCelcius = 70.2;
        tempInFahrenheit = tempInCelcius * 1.8 + 32;
        System.out.println("tempInFahrenh = " + tempInCelcius);









    }

}
