package week03;

public class smallConditionalTasks {

    public static void main(String[] args) {

    int x;
    int y = 20;
/*

    if(y==20){
        x=5  */

        boolean b = y == 20;
        if(b) {
            x = 5;
        } else
        {
            x = 0;

    }
        System.out.println(b);
        //==========================

        char char1 = 'A';
        char char2 = 'B';

        if(char1>char2){
            System.out.println("Sec caharacter comes after first one");
        }else {
            System.out.println("First chacarcter comes after second one");
        } // ===============================


    }
}
