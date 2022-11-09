package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrder {

    public static void main(String[] args) {

        ArrayList<Pizza> pizzas = new ArrayList();

        // create 100 pizza objects: size> 'S' cheesetopping> 2 peppertopping> 3
        // create 100 pizza objects? size>'M' cheesetopping> 3 peppertopping> 4
        /// create 100 pizza objects? size>'L' cheesetopping> 4 peppertopping> 5
        for (int i = 0; i < 100; i++) {
           Pizza smallPizza = new Pizza('S', 2, 3);
           Pizza mediumPizza = new Pizza('M', 3, 4);
           Pizza largePizza = new Pizza('L', 4, 5);

           pizzas.addAll(Arrays.asList(smallPizza, mediumPizza, largePizza));

        }
        System.out.println("Total number of Pizza: "+ pizzas.size());// Total number of Pizza: 300

        double totalPrice = 0;

        for (Pizza pizza : pizzas) {// first get each pizza from the ArrayList
            totalPrice += pizza.calcCost();
        }
        System.out.println("Total Price : $"+ totalPrice);//Total Price : $7800.0

    }
}
