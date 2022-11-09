package day42_Exceptions;

class FadyException extends RuntimeException{//Unchecked exception

    public FadyException (String message){
    super(message);
    }
}

class NoBreakException extends Exception{//custom  checked Exception:  if we want ot create custom checked exception, then we can inherit Exception class

}

public class CustomExceptions {

    public static void main(String[] args) {

      //  throw new FadyException("It's time for break");

        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }
    }
}
