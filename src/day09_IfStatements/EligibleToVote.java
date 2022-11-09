package day09_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {

        byte age = 25;
        String name = "Ann";
        boolean iseligibleToVote = age >= 19;
        boolean eneligibleToVote = age < 19;
/*
        if(iseligibleToVote){
            System.out.println(name + " is eligible to vote");
        }
        if(eneligibleToVote){
            System.out.println(name + " is NOT eligible to vote");
            */

        if (age >= 19) {
            System.out.println(name + " is eligible to vote");
        } else if (age < 19) {
        System.out.println(name + " is NOT eligible to vote");
        }

    }
}


