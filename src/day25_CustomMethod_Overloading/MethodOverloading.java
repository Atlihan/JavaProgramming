package day25_CustomMethod_Overloading;

public class MethodOverloading {

    public static void main(String[] args) {

        int [] intArray = {5,6,7,8,9};

        double [] doubleArray = {};

        char [] charArray = {};

        // benefit of OverLoading Method is to use only one same method\ instead of 4 different methods below/
        int sum1 = sumOfNumbers(10, 20);

       int sum2 =  sumOfNumbers(10,20,30);

      double sum3 = sumOfNumbers(5.5, 4.5);
        System.out.println("sum3 = " + sum3);// 10.0
    }
    public static int sumOfNumbers (int num1, int num2){
        return num1+num2;
    }
    public static double sumOfNumbers(double num1, double num2){
        return num1+num2;
    }
    public static int sumOfNumbers(int num1, int num2, int num3){
        return num1+num2+num3;
        //return sumOfNumbers(num1, num2)+num3;
    }

    public static double sumOfNumbers(double num1, double num2, double num3){
        return num1+num2+num3;
        //return sumOfNumbers(num1, num2)+num3;
    }
}
