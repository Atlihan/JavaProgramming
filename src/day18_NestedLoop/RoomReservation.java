package day18_NestedLoop;

import day17_While_DoWhile.WhileLoopIntro;

import java.util.Locale;
import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        /* Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to reserve a room");
        String response = scan.next().toLowerCase();
        boolean condition = false;
        if (response.equals("yes")){
            condition = true;
        }
        if (condition){
            System.out.println("Room prices:");
            System.out.println("");

        }

        }
    }

