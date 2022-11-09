package day23_CustomMethods_Void;


public class CustomMethodsPractise {

    public static void main(String[] args) {

        helloWorld5Times();// used for calling the method we have written below

        System.out.println("===================");

        helloCydeo5Times();

        System.out.println("===================");

        evenNumbers();
    }
    // create a function that can print Hello world 5 times
    public static void helloWorld5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");

        }

    }

    // create a function that can print hello Cydeo 5 times
    public static void helloCydeo5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");

        }
    }


    // create a function that can print all the even numbers from 1 to 10

    public static void evenNumbers(){
        for (int i = 2; i < 11; i+=2) {
            System.out.println(i);

        }


    }

}
