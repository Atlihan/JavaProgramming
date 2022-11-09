package week03;

public class JunaryOPeartorExamples {
    public static void main(String[] args) {

        int a = 25;
        System.out.println(++a);// 26
        System.out.println(--a);//4

        int b = 25;
        System.out.println(b--);
        System.out.println(b++);

        int z = 1000;
        int z1 = (byte)z;
        System.out.println(z1); // -24 ?????????

        //=====================================
        a= 50;
        System.out.println(--a + a++ + a-- + a++ + --a); // 49 + 49 + 50 + 49= 197

        a = 1;

        a = -a-- + a++ / -a-- * --a; // first we multiply -a-- and --a,   then /

        System.out.println(a);

        //======================================
        int x = 4;
        int y = x * 4 - x++;
        System.out.println(y); // 4 * 4 - 4 = 12

        int d = 0;
        int f = 5;

        System.out.println(d/f);





    }
}
