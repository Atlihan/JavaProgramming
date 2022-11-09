package day04_Variables;

public class Currencies {

    public static void main(String[] args) {

        short dollar = 1000;

        float lira = dollar * 9.53f;
        float euro = dollar * 0.86f;

        //jpy, pound; peso, cad, riyal ...

        System.out.println(dollar + " dollar = " + lira +  " lira");
        System.out.println(dollar + " dollar = " + euro + " euro " );

    }
}
