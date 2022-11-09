package day17_While_DoWhile;

public class BranchingStatements2 {

    public static void main(String[] args) {

        for (char i = 'A'; i < 'E'; i++) {

            if (i== 'C'){
                continue;// is opposite of break. It is for SKIPPING
            }
            System.out.println(i);// A B D

        }
        System.out.println("===========================");

        //print all even numbers from 1~ 10
        for (int i = 0; i < 11; i++) {
            if (i%2!=0){
                continue;
            }
            System.out.println("i = " + i);
            
        }


        System.out.println("==============================");
        //print all odd numbers between 1~10 (skipp odd numbers)

        for (int i = 0; i < 11; i++) {

            if (i%2 ==0){// 1 3 5 7 9
                continue;//skip

            }
            System.out.println("i = " + i);

        }

        System.out.println("=======================");

        /*

        You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123
        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked."
         */



            }

        }


