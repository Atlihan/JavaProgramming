package week05;

public class StringReview03 {

    public static void main(String[] args) {

        //Substring(Index, beginning, ending..
        String message = "We still HAVE a Long way to go";

        message = message.substring(0,1).toUpperCase()+ message.substring(1).toLowerCase();

        System.out.println("message = " + message);

        System.out.println("=========================");///
       // replace
       String word = "Java";
       word = word.replace('J','C');

        System.out.println("word = " + word);

        String browser  = "I wanna change my browser Chrome";

        browser = browser.replace("Chrome","Edge");

        System.out.println("browser = " + browser);




    }
}
