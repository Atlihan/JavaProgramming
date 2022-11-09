package day30_CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("Toyota", "Camry", "White", 2021, 35000);
        System.out.println(car1);//Car{brand='Toyota', model='Camry', color='White', year=2021, price=35000.0}


        Car car2 = new Car();
        car2.setInfo("BMW", "320i", "Black", 2020, 30000);
        System.out.println(car2);//Car{brand='BMW', model='320i', color='Black', year=2020, price=30000.0}

        Car car3 = new Car();
        car3.setInfo("Audi", "A3", "White", 2022, 40000);

    // Car [] cars = {car1, car2, car3}

        ArrayList<Car> carsList = new ArrayList<>();// then we can create ArrayList of custom object
        carsList.addAll(Arrays.asList(car1, car2, car3));

        for (Car each : carsList) {// and we can iterate them by using forloop
            System.out.println(each.brand+ " : "+each.price);//Toyota : 35000.0
           // BMW : 30000.0
            //Audi : 40000.0
        }
        System.out.println("---------------------------------------");

        carsList.removeIf(p-> p.brand.equals("BMW") && p.year >= 2005 && p.year <= 2008);
        carsList.removeIf(p-> p.brand.equals("Toyota") && p.year >= 1995 && p.year <= 1997);



    }


}
