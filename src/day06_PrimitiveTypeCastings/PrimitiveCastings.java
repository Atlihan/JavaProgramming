package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

        int x = 55;
        short y = (short)x;
        System.out.println(x + " : " + y);

        double n = 10.8;
        int s = (int) n;

        System.out.println(n + " : " + s);

        float f1 = 30.5f;
        long l1 = (long) f1;

        byte b1 = 100;
        short t1 = b1;

        System.out.println(b1 + " : " +t1);


    }
}
