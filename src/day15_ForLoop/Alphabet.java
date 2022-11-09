package day15_ForLoop;

public class Alphabet {
    // write alphabet A to Z ==>65 > 90
    public static void main(String[] args) {

        for(char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
        }

        System.out.println("=============================");

        //write Z to A
        for(char i = 'Z'; i >= 'A'; i--){
            System.out.print(i + " ");//Z Y X W V U T S R Q P O N M L K J I H G F E D C B A
        }

        System.out.println("--------------------------------");

        /* print this shape
        * * * * * * * *
        * * * * * * * *
        * * * * * * * *
        * * * * * * * *
        * * * * * * * *

         */



    }
}
