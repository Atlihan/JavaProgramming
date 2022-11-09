package week05;

public class StringReview01 {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        System.out.println(str1==str2);//True

        // but what if we create by means fo String:

        String str3 = new String("Java");
        str3 = "Java";
        System.out.println(str1 == str3);// FALSE: so we meed to check by means of (equals)

        System.out.println(str1.equals(str3)); //True

    }

}
