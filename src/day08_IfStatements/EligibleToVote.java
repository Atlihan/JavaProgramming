package day08_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {

        int age = 38;
        String name = "Josh",
        citizen = "USA";
        boolean isEligible = age>=21 && citizen =="USA";

        //Eligible
        if(isEligible){
            System.out.println("Eligible");
        }
        //Not Eligible

        if(!isEligible){
            System.out.println("Not Eligible");
        }
    }
}
