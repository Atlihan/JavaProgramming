package day32_Constructor;

public class Test {

    public Test (){
        System.out.println("A");
    }
    public Test (int a){//A B
        this();
        System.out.println("B");
    }
    public Test (double a){
        this(9);
        System.out.println("C");//ABC
    }

    public Test (String str){
        this(2.5);
        System.out.println("D");//ABCD
    }

    public static void main(String[] args) {
        new Test("JAVA");//ABCD

    }
}
