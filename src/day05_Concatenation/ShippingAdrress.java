package day05_Concatenation;

public class ShippingAdrress {

    public static void main(String[] args) {
        String name = "James King",
                buildingNumber = "11821B",
                streetName= "Johns Branch Dr",
                city = "Mc Lean",
                zipCode = "Ca 2020";

        //System.out.println(name + "\n" + buildingNumber+ " " + streetName + "\n"+ city + ", " + zipCode);

        String address = (name + "\n" + buildingNumber+ " " + streetName + "\n"+ city + ", " + zipCode);

        System.out.println(address);
    }

}
/*
Jimmy Joe
7925 Jones Branch Dr
Mc Lean, CA 2025

 */