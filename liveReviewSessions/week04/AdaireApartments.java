package week04;

import java.util.Scanner;

public class AdaireApartments {
    // ask the user for which floor he's living at?

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int floorNumber;
        System.out.println("Which floor are you living at?");

        floorNumber = scan.nextInt();
        if (floorNumber == 1) {
            System.out.println("You live at First Floor");
        } else if(floorNumber == 2) {
            System.out.println("You live at second floor");
        } else{
            System.err.println("There is NO such Floor");
            }
        scan.close();

        // Lets do this task via Switch method:

        switch (floorNumber){
            case 1:
                System.out.println("You live at First Floor");
                break;
            case 2:
                System.out.println("You live at second Floor");
                break;
            default:
                System.err.println("There is NO such Floor");
        }
        scan.close();
        }

    }
