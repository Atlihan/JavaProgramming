package day08_IfStatements;
// LOGICAL AND && OPERATORS
public class LogicalOperators {
    public static void main(String[] args) {

        int age = 23;
        String name = "Josh";
        int creditScore = 720;
        int income = 40000;
        boolean isEligible2 = creditScore >= 700 && age>=2 && income>=60000;
        System.out.println("Josh is eligible for loan : " + isEligible2);

        // All conditions must be TRUE to get the result TRUE.Otherwise False

        //===================================================

        // LOGICAL OR || OPERATOR

        String name3  = "Shay";
        int age3 = 21;
        char gender = 'F';
        boolean isEligible3 = age3 >= 18 && (gender == 'F'|| gender == 'M');
        //                      21>18 && ( F == M || F == F) then result is True

        System.out.println(name3+ " is eligible to register : " +isEligible3);

        //........................

        String name4 = "James";
        String countryOfBirth = "UK";
        boolean marriedToUSCitizen = false;

        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true;
                            // false                    false
        System.out.println(name4 + " is eligible to apply for USA citizenship : " + isEligible4);

        //=============================================================================
        // Lo NOT Operator
        boolean result2 = true;
        System.out.println("result2 is = " +result2);

        boolean result3 = !result2;
        System.out.println("result3 is = " +result3);
        //result2 is = true
        //result3 is = false
        //.......................................
        int score= 80;
        boolean passed = score>=60;
        boolean failed = !passed;
        System.out.println("passed = " +passed);
        System.out.println("failed = " +failed);

    }
}
