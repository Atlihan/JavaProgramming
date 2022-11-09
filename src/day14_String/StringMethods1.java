package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {

        //Trim Method: returns new string without "white space"

        String str1 = "    batch 25    ";
        str1 = str1.trim(); // when we assign str1 back, then we'll be able to get the object without white spaces

        System.out.println(str1);

        String str3 = "Java Programming";// if we want to find the index no of 4th "a"
        int n3 = str3.indexOf("an");
        System.out.println("n3 = " + n3);

        int n4 = str3.indexOf("gua");// what if index no of 3 rd "g"
        System.out.println("n4 = " + n4);

        int n5 = str3.lastIndexOf("g");
        System.out.println("n5 = " + n5);

        System.out.println("==============================================");

        String s = "Java Nova Cawa orange";

        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int fourthA = s.indexOf("Ca") +1;//
        //int fourthA = s.indexOf("ava W");
        //int fourthA = s.lastIndexOf("av");

        int thirdA = s.indexOf("a C");

        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("fourthA = " + fourthA);


        System.out.println("firstA = " + firstA);






    }
}
