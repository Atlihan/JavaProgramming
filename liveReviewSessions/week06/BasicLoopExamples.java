package week06;

public class BasicLoopExamples {

    public static void main(String[] args) {

        // write for loop that displays the folliwing set; 10 20 30 40 50 60 70 ..100
        // iterate 10 by 10

        for (int i = 0; i <= 1000; i += 10) {
            if (i <= 1000) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println("================================");
        //iterate 1 by 10

        for (int i = 0; i < 1000; i++) {
            if(i%10==0){
                System.out.print(i+ ", ");
            }

        }
        System.out.println("=====================================");

        int x = 0;// initalization
        for ( ; x < 1000 ; );// condition
        if (x%10==0) {

            System.out.println(x + ", ");

        }else{
            x++;//iteration
        }
        System.out.println(x + ", ");

    }

   

   


}

