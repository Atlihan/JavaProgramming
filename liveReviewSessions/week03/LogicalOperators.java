package week03;

public class LogicalOperators {
    public static void main(String[] args) {

        int A =20;
        int O = 30;
        int P = 30;

        boolean comp = A <  O || O >= P;

        System.out.println("comp = " + comp); //True
        System.out.println("O ="+ O);// 30 because

        boolean comp1 = A < O || --O >= P;

        System.out.println("comp1 = " + comp1);


        boolean comp2 = A > O || O-- >= P;
        System.out.println("comp2 = " + comp2);// True

        boolean comp3 = A > O && ++O >= P;
        System.out.println("comp3 = " + comp3);//False if the first compailor does not caheck

    }
}

