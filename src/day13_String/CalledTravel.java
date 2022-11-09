package day13_String;

import java.util.Scanner;

public class CalledTravel {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println(" Do you have a valid passport ?");
        String validPassport = scan.nextLine();

        if(validPassport.equalsIgnoreCase("YES")){//If the user enters yes:

            int baseCost = 1000;
            int totalCost = baseCost;
            System.out.println("Which country are yoi going to ?");
            String country = scan.nextLine();

            System.out.println(" how many bags they will you take with ? ");
            byte numberOfBags = scan.nextByte();
            scan.nextLine();
            totalCost += numberOfBags*50;

            System.out.println("How many people ");
            int numberOfPeople= scan.nextInt();
            scan.nextLine();


            if(numberOfPeople<3){
                totalCost -= 100*numberOfPeople;
            }else{
                totalCost-=300;
                totalCost +=baseCost * numberOfPeople;

                System.out.println("Name of the people: ");
                String nameOfThePeople = scan.nextLine();

                System.out.println("Your ticket is booked to "+ country+". "+
                        "We have charged extra for the "+ numberOfBags+" bags "+
                        "but you are traveling with "+ nameOfThePeople+
                        "so we are giving a discount. "+
                        "Your total cost is $"+ totalCost);
            }
            }else{



        }


    }
}
/*
Create a class calledTravel. Make a cost variable to calculate how much the person will owe after everything.
		Ask the user if they have a valid passport (yes or no)
			If the user enters yes:
					The base cost of the ticket should be set to: 1000
            		Ask the user the country they to travel to (String, multiple word)
            		Ask the user how many bags they will take with them (byte)
                			> Each bag will add 50 to the cost
            		Ask the user how many people they will travel with (short)
                			> For each person the cost is reduced by 100. Up to a limit of 300.
            		Ask the user to Enter the name of the people they will travel with in one line, separating each name with a comma (String, multiple word)

            		Print: "Your ticket is booked to $countryName. We have charged extra for the $numberOfBags bags but you are traveling with $peopleYouTravelWith so we are giving a discount. Your total cost is $costAmount"

    		If the user enters no:
    				The base cost of the passport renewal is: 200
		            Ask the user when their passport expired(int)
		                > Each year it was expired adds 75 to the cost
        			Ask the user which country they plan to travel
		            Ask the user if they will be traveling in the next year (String - yes or no)
		                > If yes: add 100 to the cost
		                > If no: subtract 50 from the cost

        			Print: "Looks like your password has been expired for $years, but not to worry we will get it ready for you to travel to $allCountries. Your total cost has come out to $costAmount."

 */