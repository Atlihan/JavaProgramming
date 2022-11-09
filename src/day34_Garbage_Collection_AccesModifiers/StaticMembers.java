package day34_Garbage_Collection_AccesModifiers;

public class StaticMembers {

    static class class1{//Static class Only if there's a nested class

    }

    public static int num;//Static Variable
    public static void method1(){

    }
    static {

    }

}

class A{// outer class CAN NOT be static
    static class B{// only inner class can be static

    }
}
