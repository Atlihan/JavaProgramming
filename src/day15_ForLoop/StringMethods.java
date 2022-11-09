package day15_ForLoop;

public class StringMethods {

    public static void main(String[] args) {

        String str = "";

        boolean r= str.isEmpty();

        System.out.println(r);// true

      boolean r1 = str.isBlank();
        System.out.println("r1 = " + r1);// true

        // String str = "       ";
        boolean r3 = str.isBlank();
        System.out.println("r3 = " + r3);//false

        boolean r4 = str.isEmpty();
        System.out.println("r4 = " + r4);

        System.out.println("========================");

        String s1 = "CYDEO";
        String s2 = "cydeo";
        System.out.println(s1.equals(s2));//false: Because "equals" compare the CASE. "Case sensitivity"
        System.out.println(s1.equalsIgnoreCase(s2));//true: because equalsIgnoreCase compare letter by letter.

        System.out.println("==========================");

        String sentence = "My favorite language is Java";

        boolean hasCSfarp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");// this statement cares about case sensitivity and always seek for the same result
        boolean hasJava2 = sentence.toLowerCase().contains("java");// so it ignores the case sensitivity and returns true


        System.out.println("hasJava = " + hasJava); //true
        System.out.println("hasCSfarp = " + hasCSfarp);//false

        System.out.println("================");

        String a = "Wooden Spoon";

        boolean x = a.startsWith("Woo");
        System.out.println(x);//ture

        boolean y = a.endsWith("Spoon");
        System.out.println(y);// true








       

        
    }

}
