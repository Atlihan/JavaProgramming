package day07_Operators;

public class ShorthandOperators {

    public static void main(String[] args) {

        // = assignment: enables assigning new "value" for a "variable"
        //NOTE: we CAN NOT assign an other type of varriable/
        // if we start with "int", we MUST use "int" on other lines when we assign new value for the variable
        int number = 100;
        System.out.println( "number = " +number); // 100

        number = 120;
        System.out.println("number = "+ number);// 120

        String word = "Java Programming";
        System.out.println("Word = "+word);//Java Programming
        word = "Cydeo";
        System.out.println("word = "+word);// Cydeo

        //==========================
        //Addition Assignment
        double num = 2.5;
        System.out.println("num : " + num); //2.5
        num += 5.5;
        System.out.println("num :" +num);//8.0

        //==================================
        //Subtraction Assignment
        double availableBalance= 1300.5;
        //if we withdraw 500$ and then deposit 400$:
        availableBalance -= 500; // 800.5
        availableBalance += 400;//1200.5

        System.out.println(availableBalance);


        //===================================
        //Multiplication Assignment
        double salary = 5000.5;
        salary *= 2;// 1001.0
        System.out.println("salary : "+ salary);//1001.0

        //===================================
        //Devision Assignment

        double num2 = 25000;
        num2 /= 2;
        System.out.println(num2);//12500.0

        //===================================
        //Remainder Assignment
        double num3 = 100;
        num3 %= 3;

        System.out.println("num3 = " +num3); //num3 = 1.0
//===================================================
        // how many cents left after 127?
        int amount = 127;
        int quarters = 25;
        int cents2= 127/25; // 2 cents left
        //or
        cents2 %= 25;
        System.out.println(cents2); // 2




    }
}
