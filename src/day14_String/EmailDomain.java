package day14_String;

public class EmailDomain {

    public static void main(String[] args) {
//write a program that can create email domain

        String email = "Caydeo.School@gmail.com";
        int beginnIngIndexIngIndex = email.indexOf("@")+1;
        int endingIndex = email.lastIndexOf(".");

        String domain = email.substring(beginnIngIndexIngIndex, endingIndex);
        System.out.println(domain);

        System.out.println(" ==================");

        String str1 = "Java is fun, Java is cool";
        //Java is fun
        //             0123456789

        String s1 = str1.substring(0, 10+1);

        //Java is cool:
        int beg = str1.indexOf(" J")+1;
        int end = str1.lastIndexOf(",");
        String s2 = str1.substring(beg, end);

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);














    }
}
