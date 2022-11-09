package day07_Operators;

public class Castings {
    public static void main(String[] args) {

        float averageScore = 20.5f;
        byte num1 = (byte)averageScore; //explicit casting, because byte is only for INTEGERS
        short num2 = (short)averageScore; //explicit casting
        int num3 = (int)averageScore;//explicit casting
        //int num4 = (long)averageScore; not applicable.
        float num5 = averageScore;// same type does not cast in to each other,// no casting
        double num6 = averageScore; //implicit casting
        long num7 = (long)averageScore;

        System.out.println("num1 = " +num1);
        System.out.println("num2 = " +num2);
        System.out.println("num3 = " +num3);
        System.out.println("num5 = " +num5);
        System.out.println("num6 = " +num6);
        System.out.println("num7 = " +num7 );



    }
}
