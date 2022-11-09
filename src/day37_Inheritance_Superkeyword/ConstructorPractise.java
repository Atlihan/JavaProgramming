package day37_Inheritance_Superkeyword;



class A {
    public A (){// if the parent Class Constructor is default, then you don't need to call super keyword manually, because the child class constructor calls it automatically
        System.out.println("A");
    }
}

class B {
    public B () {
        System.out.println("B");
    }
}

public class ConstructorPractise {


}
