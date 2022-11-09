package week08;

public class ShoppingAppReport {

    public static void main(String[] args) {

       String [] items = {"SHoes", "Jacket", "Gloves", "Airpods", "Ipad", "iphone 13"};
       double [] prices = { 99.99, 350.50, 9.99, 250.0, 439.50, 39.99};
       int [] itemIDs = {12345, 12346, 12347, 12348, 12349, 123450};

        System.out.println(" Find the first index number of 'Gloves' ");

        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("Gloves"));{
                System.out.println("Gloves found at index = "+ i);
                break;
            }

        }
        System.out.println("===============================");

        System.out.println("Print all items except the ones begin with'j'");

        for (int i = 0; i < items.length; i++) {
            if (items[i].contains("J")){
                continue;
            }
            System.out.println("items : "+items[i]);

        }

        System.out.println("======================");

        System.out.println("do we have ipad in items");
        boolean itemExists = false;

        for (String item: items) {
            if (item.equalsIgnoreCase("ipad"));
            itemExists = true;
            break;
        }
        if (itemExists){
            System.out.println("we have ipad");
        }
        System.out.println("=======================");
    // find the count of prices  bigger than 50

        int count = 0;
        for (double each : prices) {
            if(each > 50){
                count++;
            }
        }
        System.out.println(count);
    }
}
