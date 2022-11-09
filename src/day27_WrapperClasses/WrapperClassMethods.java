package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num+1);//124
        System.out.println(str+1);//1231

        String str2 = "10.5";
        double num2 = Double.parseDouble(str2);
        System.out.println(num+1);//11.5

        long max = Long.MAX_VALUE;
        long min = Long.MIN_VALUE;
        System.out.println("max = " + max);  //max = 9223372036854775807
        System.out.println("min = " + min); // min = -9223372036854775808

        String str3 = "true";

       boolean r1 =  Boolean.parseBoolean(str3);
        System.out.println(r1);//true

        System.out.println("-------------------------");

        String s2 = "123";
        Integer x = Integer.valueOf(s2);
        int y = Integer.valueOf(s2);

        System.out.println(x); //123
        System.out.println(y); //123

        String s3 = "10.5";

        Double z = Double.valueOf(s3);

        System.out.println(z);//10.5

        System.out.println("------------------------");

        char ch1 = '0';

       boolean r2 =  Character.isDigit(ch1);
        System.out.println(r2);//

        System.out.println("------------------------");

              // how to find the sum of digits in the string
        String s = "ab1cde2efg3hi4";
        int sum = 0;

        for (char each : s.toCharArray()) {
            if(Character.isDigit(each)){
                sum+= Integer.parseInt(" "+each);
            }
        }
        System.out.println("sum = " + sum);

        System.out.println("---------------------------------");

        /*
        Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                        1. Password MUST be at least have 8 characters long, and should not contain space
                        2. PassWord should at least contain one upper case letter
                        3. PassWord should at least contain one lower case letter
                        4. Password should at least contain one special characters
                        5. Password should at least contain a digit
                        */





    }
}
