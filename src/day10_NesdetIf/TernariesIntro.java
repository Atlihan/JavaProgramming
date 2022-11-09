package day10_NesdetIf;

public class TernariesIntro {
    public static void main(String[] args) {
        int n = 100;
        if(n%2==0) {
            System.out.println("Even Number"); //String
        }else{
            System.out.println("Odd Number"); // String
        }
        System.out.println("==================================");

        // If every if statements block results in same data type (String), then we can use Treneries.

        String result1 = (n%2==0)? "Even" : " Odd";
        System.out.println(result1);

        System.out.println("====================================");

        int age = 23;
        if(age>= 21){
            System.out.println("Eligible to buy alcohol"); //String
        }else{
            System.out.println("Eneligible to buy alcohol"); //String
        }

        System.out.println("-----------------------");

        //System.out.println((age>=21) ? "Eligible to buy alcohol" : "Eneligible to buy alcohol"); OR,

        String result2 = (age>=21) ? "Eligible to buy alcohol" : "Eneligible to buy alcohol";
        System.out.println(result2);//Eligible to buy alcohol

        System.out.println("==========================================");
        int number = 1000;

        /*
        if(number>0){
            System.out.println("Positive");
        }else if (number<0) {
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
         */

        String result3 = (number>0)? "Positive" : (number<0)? "Negative" : "Zero";
        System.out.println(result3);

    }



}
