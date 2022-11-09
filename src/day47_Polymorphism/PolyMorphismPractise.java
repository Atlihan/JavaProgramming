package day47_Polymorphism;

import day38_Inheritance.carTask.BMW;
import day38_Inheritance.carTask.Car;
import day38_Inheritance.carTask.Tesla;
import day38_Inheritance.carTask.Toyota;

public class PolyMorphismPractise {

    public static void main(String[] args) {

        Car[] cars = {
                new Toyota("Camry", 2020, 2000, "Gray", 125000),

         new Tesla("Model S", 2021, 30000, "Black", 100000),

        new BMW("X5", 2022, 150000, "White", 15000),
        };

        for (Car eachCar : cars) {
            if (eachCar instanceof Toyota){
                if (eachCar.year >= 2010 && eachCar.year <=2011){
                    System.out.println(eachCar);
                }
            }

        }
        System.out.println("----------------");
        Car carWithHighestMilage = cars[0];
        for (Car eachCar : cars) {
            if (eachCar.miles > carWithHighestMilage.miles){
                carWithHighestMilage = eachCar;
            }

        }
        System.out.println(carWithHighestMilage);
    }
}
