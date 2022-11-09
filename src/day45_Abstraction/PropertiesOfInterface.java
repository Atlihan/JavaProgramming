package day45_Abstraction;

public interface PropertiesOfInterface {

    int a = 100;
    static int b = 200;

    /*
    public PropertiesOfInterface (int a){
        this.a =a;
    }
    */
    /*
    static {
        b = 100;
    }

     */


    /*
    public void method1(){
        System.out.println("Instance Method");
    }

 */

    public static void method2(){
        System.out.println("Static method");
    }

    public abstract void method3 ();

    default void method4(){// if one implementation is necessary for all sub classes, then we can use default method with the body
        System.out.println("default Method");
    }
}
