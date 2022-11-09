package week10;

public class LogInTest {

    public static void main(String[] args) {

    }

    public static boolean logIn(String userName, String password){
        if (userName.equalsIgnoreCase("Cydeostudent") && password.equalsIgnoreCase("cydeopassword")){
            return true;
        }
        return false;

        //  public static String login(String username, String password){ } NOT METHOD OVERLOADING

    }

    public static boolean login(){
        if(getUsername().equalsIgnoreCase("cydeoStudent") && getPassword().equalsIgnoreCase("cydeoPassword")){
            return true;
        }
        return false;
    }
    public static String getPassword(){
        return "CydeoPassword";
    }
    public static String getUsername(){
        return "CydeStudent";
    }

}
