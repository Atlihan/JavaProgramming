package day32_Constructor;

public class Carpet {
    /*
    1.1 create a custom class for the Carpet class that should contain the following:
                Attributes:
                        width, length, unitPrice, isPersian (boolean)

				Add a constructor to set all the instances

                Actions:
                    calcCost(): should be able to calculate the total cost of the carpet and return it as double
                    toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()

            total price of carpet = (width*length)*unitprice

            if the carpet is persian  carpet, add 200$ to the totalPrice
     */

    public double with, length, unitPrice;
    public boolean isPersian;

    public Carpet(double with, double length, double unitPrice, boolean isPersian) {
        this.with = with;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        double totalPrice = (with*length)*unitPrice;

        if(isPersian){
            totalPrice+= 200;
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "with=" + with +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price= $" + calcCost() +
                '}';
    }
}
