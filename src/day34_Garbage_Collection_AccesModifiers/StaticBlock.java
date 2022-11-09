package day34_Garbage_Collection_AccesModifiers;

public class StaticBlock {

    public static void main(String[] args) {

        System.out.println("Main Method");
    }

    static {// runs first before
        System.out.println("Static Block");
    }
}
