package week02;

public class ShoppingList {
    public static void main(String[] args) {
        String item1, item2, item3, report;
        double price1, price2, price3, totalPrice;

        item1 = "tomatoes";
        item2 = "cheese";
        item3 = " apples";

        price1 = 5.5;
        price2 = 3.5;
        price3 = 6.3;

        /* report = "Item1: " +item1+" Price: "+  price1+ ", Item2: "+item2+" Price: "+price2+", Item3: "+item3+" Price: "+price3+"\n"+
        //                "Total price: "+totalPrice;*/

        totalPrice = price1 + price2+ price3;
        System.out.println("report = "+ "Item1: " +item1+ " Price: "+ price1 + ", Item2: " +item2+ " Price : "+price2+ ", Item3: "+item3+ " Price : "+price3+ "\n" + "Total Price = "+totalPrice     );











    }
}
