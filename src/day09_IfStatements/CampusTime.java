package day09_IfStatements;

import java.sql.SQLOutput;

public class CampusTime {
    public static void main(String[] args) {

        int time = 2;
        String status;

        if (time == 8) {
            status = "open";
        } else if (time == 9) {
            status = "open";
        } else if (time == 10) {
            status = "open";
        } else if (time == 11) {
            status = "open";
        } else if (time == 12) {
            status = "open";
        } else if (time == 13) {
            status = "open";
        } else if (time == 14) {
            status = "open";
        } else if (time == 15) {
            status = "open";
        } else if (time == 16) {
            status = "open";
        } else if (time == 17) {
            status = "open";
        } else if (time == 18) {
            status = "open";
        } else if (time == 19) {
            status = "open";
        } else if (time == 20) {
            status = "open";
        } else if (time == 21) {
            status = "open";
        } else if (time == 22) {
            status = "open";
        } else if (time == 23) {
            status = "open";
        } else {
            status = "closed";
            System.out.println("Campus is "+status);

        }

    }
}

/*Create a class called CampusTime, an integer variable named time is
given with a number between 1~24 has been initialized, write a program
that can find out if the campus is open or not. Campus is open from 8
am(8) to 11 pm (23) If user enters a time within the open time they
should see message: “open”  but if the time entered is outside of
operating hours they should see: “ closed”*/