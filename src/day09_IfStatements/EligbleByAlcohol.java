package day09_IfStatements;

public class EligbleByAlcohol {
    public static void main(String[] args) {

        int age = 21;

        boolean eligibleByAlcohol = age >= 18;
        boolean eneligibleByAlcohol = !eligibleByAlcohol;
/*
        if (age >= 18) {
            System.out.println("Age " + age + " is eligible to buy alcohol");
        }
        if (age < 18) {
            System.out.println("Age " + age + " is NOT eligible to buy alcohol");
            //=============================================*/

            if (eligibleByAlcohol) {
                System.out.println("Age " + age + " is eligible to buy alcohol");
            }else if(eneligibleByAlcohol){
                System.out.println("Age " + age + " is NOT eligible to buy alcohol");

            }
        }
    }
