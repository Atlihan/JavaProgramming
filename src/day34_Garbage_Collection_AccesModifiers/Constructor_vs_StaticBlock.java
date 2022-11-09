package day34_Garbage_Collection_AccesModifiers;

public class Constructor_vs_StaticBlock {

    static {// static block always executes first
        System.out.println("Static Block");
    }
    public Constructor_vs_StaticBlock(){// it does not execute because there's no OBJECT assigned
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
    }



}
