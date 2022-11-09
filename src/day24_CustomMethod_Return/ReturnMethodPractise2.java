package day24_CustomMethod_Return;

public class ReturnMethodPractise2 {

    public static void main(String[] args) {
        /*
        "A"==> Excellent
        "B"==> Great....
         */
       String str1 =  grade(95);// RETURN METHOD can be assigned to a VARIABLE

       if (str1.equals("A")){
           System.out.println("Excellent");

       } else if (str1.equals("B")) {
           System.out.println("Great");

       } else if (str1.equals("C")) {
           System.out.println("Good");
           
       } else if (str1.equals("D")) {
           System.out.println("Passed");

       }else{
           System.out.println("Try again");
       }

    }

    public static String grade(int score) {// if it adds a value then I need to assign it to a variable (String)
        String result="";
        if(score<0 || score>100){
            result="Invalid";

        } else{//valid
            result = (score>=90)? "A" : (score>=80)?"B" :(score>=70)?"C" :(score>=60)?"D" :"F";
        }
        return result;

    }
}
