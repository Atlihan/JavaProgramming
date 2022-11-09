package day15_ForLoop;

public class ReplaceX {

    public static void main(String[] args) {

        String str = "xcodeX";// firts replace 'x' with /'a' and then replace 'X' with 'a'

       String result =  str.replace("x", "a").replace("X", "a");
        System.out.println(result);

    }
}
