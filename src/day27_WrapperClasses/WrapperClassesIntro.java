package day27_WrapperClasses;

import org.w3c.dom.ls.LSOutput;

public class WrapperClassesIntro {

    public static void main(String[] args) {

        int num1 =100;

        Integer n1 = num1;// autoboxing

        int num2 = n1;// unboxing

        System.out.println("------------------------------");

        Integer integerValue= 100;
        long ongValue = integerValue;

        Byte b1= 5;

        byte a = b1;
        short s = b1;
        int i = b1;
        long l = b1;

        System.out.println("---------------------------------");

        int num3 = 200;
        //Long l2 = num3; CAN NOT BE ASSIGNED
        //Double d1 = num3; CAN NOT BE ASSIGNED
        Integer num4 = num3;

        System.out.println("------------------------------");





    }





}
