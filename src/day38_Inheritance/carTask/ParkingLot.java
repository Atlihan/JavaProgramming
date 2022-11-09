package day38_Inheritance.carTask;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", 2020, 2000, "Gray", 125000);

        Tesla tesla = new Tesla("Model S", 2021, 30000, "Black", 100000);

        BMW bmw = new BMW("X5", 2022, 150000, "White", 15000);

        toyota.start();
        tesla.start();
        bmw.start();
    }
}
