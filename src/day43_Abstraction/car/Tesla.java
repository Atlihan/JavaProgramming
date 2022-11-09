package day43_Abstraction.car;

public final class Tesla extends Car {// if we do not want any feature to be inherited by other class then we use final keyword
    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Say \"start\" ");

    }

    public void autoPilot(){
        System.out.println(getBrand()+" "+ getModel()+ " has auto pilot fetaure");
    }
}
