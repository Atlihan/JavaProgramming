package day38_Inheritance.carTask;

public class Toyota extends Car {


    public Toyota( String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void reliable(){
        System.out.println(brand+ " "+ model+" is reliable");
    }

    public void start (){//Overriding method: This method executes instead of parent class start() method
        System.out.println("Twist the key to start "+ brand+ " "+ model);
    }
}
