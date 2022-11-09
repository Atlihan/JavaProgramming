package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffer {

    /*
    2. Create a class named MyOffers:

				2.1 Create 7 objects of Offer
				2.2 Create an array of Offers named myOffers and store all 7 objects of offers
				2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
						2.3.1 Write a program that can remove the offer objects that are not full-time
				2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
						2.4.1 Write a program that can remove all the offers that are not from local
				2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
						2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
				2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
						2.6.1 Write a program that can remove all the offers that are not for SDET
				2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
						2.7.1 Write a program that can remove all the offers that are offering less than 100K salary
     */

    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("VA", "Amazon Inc ", "SDET",110000, true, true, true, true);

        Offer offer2 = new Offer();
        offer2.setInfo("CA", "Sony Inc", "QA", 115000,true, false, false, true );

        Offer offer3 = new Offer();
        offer3.setInfo("FL", "Apple Inc", "QE", 125000, true, true, true, true);

        Offer offer4 = new Offer();
        offer4.setInfo("TX", "CapitalOne", "SM", 130000, false, false,true, true);

        Offer offer5 = new Offer();
        offer5.setInfo("WX", "Bank Of America", "BA", 145000, true, true, false, false);

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);
        System.out.println("----------------------------------------");

        Offer [] myOffers  ={offer1, offer2, offer3, offer4, offer5};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p-> !p.isFullTime);// removes if the offer is NOT full time

        System.out.println(fullTimeOffers.size());//4

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p-> !p.location.equals("VA"));// VA is just given as an example. removes the offer if the offer NOt from local area

        System.out.println(localOffers.size());
        // Ex. print out that non-local offer above
        for (Offer localOffer : localOffers) {
            System.out.println(localOffer.companyName+ ": "+ localOffer.salary );// Amazon Inc : 110000.0

            System.out.println("------------------------------------");



        }

    }
}