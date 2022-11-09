package day14_String;

public class StringMethods3_Substring {

    public static void main(String[] args) {

        //sunstring : beginning index, ending index

        String word = "Cydeo";
       // String brand = word.substring(0,4);//If we do not add +1,
        // it will result without the last index of the character "o": brand = Cyde
        // that's why wee need to add +1 to get the last character "o"

        String brand = word.substring(0, 4+1);
        System.out.println("brand = " + brand);//brand = Cydeo

        String str1 = word.substring(6);// we do not need to add the ending index when we focus of the end of the string
        System.out.println("str1 = " + str1);

        System.out.println("=================================");

        String word2 = "Java Programming Language";
        String s1 = word2.substring(0,word2.indexOf(" "));// word2 = Java
        String s2 = word2.substring(word2.indexOf(" ")+1 , word2.lastIndexOf(""));//Programming
        String s3 = word2.substring(word2.lastIndexOf(""));//Language we dont need to give the ending index
        // when we want to call the index no till the end of string

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        



    }
}
