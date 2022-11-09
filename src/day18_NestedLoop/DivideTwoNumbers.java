package day18_NestedLoop;

public class DivideTwoNumbers {

    public static void main(String[] args) {
      /*Write a program that can divide two positive numbers without using / (division) and
    (multiplication) and % operators
    20 / 6 ==> 3 with the remainder of 2

                        a = 20
                        b = 6;

                        a -= b;  // a = 14
                        a -= b;  // a = 8
                        a -= b;  // a = 2
                        x = 100;
                        y = 8;

                       while(a >= b){
                                a -= b;
                                count++;
    */
        int a = 30;// 23, 16, 9, 2
        int b = 7;

        int count = 0;// as long as a is subtracted by b >>> 1+1+1

        while (a>b){// as long as we can SUBTRACT b from a;
            a-=b;// after the first subtraction,  a becomes 23, then count becomes 1
            count++;
        }
        System.out.println(count+" with the remainder of "+a );

    }

}
