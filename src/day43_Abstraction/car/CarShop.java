package day43_Abstraction.car;

public class CarShop {

    public static void main(String[] args) {

     //   Car car1 = new Car("Cydeo", "A5", "Blue", "2022", 15000); We CAN NOT BE CREATE object from Abstract class, due to it is not concrete

        Honda honda = new Honda("Accord", "White", 2022, 1200000);

        Audi audi = new Audi("A4", "black", 2020, 110000);

        Tesla tesla = new Tesla("Mod 13", "Gray", 2021, 1100000);

        honda.setColor("Red");
        audi.setColor("White");
        tesla.setPrice(3000000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);





    }
}
