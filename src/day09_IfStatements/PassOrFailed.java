package day09_IfStatements;

import java.sql.SQLOutput;

public class PassOrFailed {

    public static void main(String[] args) {

        int score = 75;

        if (score >= 60) {
            System.out.println("Congrats; you passed");
        } else {
            System.out.println("Failed");

            System.out.println("========================================");

            if (score >= 60) {
                System.out.println("Congrats; you passed");
            }
            if (score < 60) {
                    System.out.println("Failed");
                }
            }

        }
    }
