package day07_Operators;

import org.w3c.dom.ls.LSOutput;

public class UnaryOperators {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(++a);// pre increment increases the value by 1 right away

        int b = 100;
        System.out.println(--b);//pre decrement decreases the value by 1 right away

        int c = 50;
        System.out.println(c++);// post increment passes the correct value, then it increases by 1 right away
        System.out.println(c);

        int d = 30;
        System.out.println(d--);//post decrement passes the correct value, then it decreases by 1 right away
        System.out.println(d);


    }

}


