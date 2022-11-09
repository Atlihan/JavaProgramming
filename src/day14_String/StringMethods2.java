package day14_String;

import org.w3c.dom.ls.LSOutput;

public class StringMethods2 {
    public static void main(String[] args) {

        String str = "Java is fun, I love Java";

        String str2 = str.replace("Java" , "Python");
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);//Python is fun, I love Python

        String email = "johnsmitf@gmail.com";
        email = email.replace("gmail", "yahoo");
        System.out.println("email = " + email);

        String sentence = " Java Python Python Python Char ### ";
        String sentence2 = sentence.replace("Python", "");
        System.out.println("sentence2 = " + sentence2);// sentence2 =  Java    Char ###
        sentence2 = sentence2.replace("   ", "");// in order to replace 3 spaces...
        System.out.println("sentence2 = " + sentence2);// sentence2 =  Java Char ###


        String s = "Dog Dog Dog Dog Dog Dog ";
        s= s.replace("Dog","Cat");// we need to assign it back because every String object is immutable
        System.out.println("s = " + s);// s = Cat Cat Cat Cat Cat Cat


        String s2 = "C# is fun, C# is cool";// what if I want to replace only "2nd C#" with "Java"
        s2 = s2.replace(" C#", " Java");
        System.out.println("s2 = " + s2);//s2 = C# is fun, Java is cool


        String result = "Java Java Java";
        //result = result.replace("Java", "Phyton"); "Phyton Phyton Phyton"
        result = result.replaceFirst("Java", "Phyton");
        System.out.println("result = " + result);//result = Phyton Java Java

        String result2 = "C# s fun, C# is cool";
        result2 = result2.replaceFirst("C#", "Java");
        System.out.println("result2 = " + result2);//result2 = Java s fun, C# is cool

        String result3 = "Java";
        result3 = result3.replaceFirst("va", "vo");// what if we change the 2nd "a" with "o"
        System.out.println("result3 = " + result3);//result3 = Javo













    }
}
