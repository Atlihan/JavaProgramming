package day32_Constructor;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("Default constructor");
    }
    public ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int argument");
    }
    public ConstructorCalls(String str){
        this(10);
        System.out.println("Constructor with string argument");
    }

    public static void main(String[] args) {

        ConstructorCalls obj1  = new ConstructorCalls();//Default constructor

        System.out.println("----------------------------");

        ConstructorCalls obj2 = new ConstructorCalls(1);

        System.out.println("-----------------------------");//Default constructor //Constructor with int argument

        ConstructorCalls obj3 = new ConstructorCalls("Java");
        //Default constructor
        //Constructor with int argument
        //Constructor with string argument





    }
}
