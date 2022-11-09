package week07;

public class TaskNestedLoop02 {

    public static void main(String[] args) {

        // write a programm to print the following
        /*
        1
        10
        101
        1010
        10101
        101010

         */
        for (int i = 1; i <=6 ; i++) {// for the rows

            for (int j = 1; j <=i ; j++) {// column number depends on row number

                if (j%2==1){// even number
                    System.out.print(1);
                }else{// odd number
                    System.out.print(0);
                }

            }
            System.out.println();


        }

    }
}
