package day19_Recap_Loops_Strings;

public class ExitMethod {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            if (i==3){
                //break;terminates the loop
               //  continue; terminates the curretn iteration of the loop
                System.exit(0);// terminates the program

            }
            System.out.println(i);

        }
    }
}
