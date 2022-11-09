package day28_ArrayList;

public class StrongPassword {

    public static void main(String[] args) {

        String password = "Cydeo1990@";

        boolean r1 = password.length()>=8 && !password.contains(" ");
        boolean r2 = false;// permanent result
        boolean r3 = false;
        boolean r4 = false;
        boolean r5 = false;

        char [] chars = password.toCharArray();

        for (char each : chars) {
            if(Character.isUpperCase(each)){
                r2 = true;
            }else if(Character.isLowerCase(each)){
                r3 = true;
            }else if(Character.isDigit(each)){
                r5 = true;
            }else{// special char
                r4 = true;
            }
        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;

        System.out.println("isStrongPassword = " + isStrongPassword);//true

    }
    public static boolean isStrongPassword (String password){

        boolean r1 = password.length()>=8 && !password.contains(" ");
        boolean r2 = false;// permanent result
        boolean r3 = false;
        boolean r4 = false;
        boolean r5 = false;

        char [] chars = password.toCharArray();

        for (char each : chars) {
            if(Character.isUpperCase(each)){
                r2 = true;
            }else if(Character.isLowerCase(each)){
                r3 = true;
            }else if(Character.isDigit(each)){
                r5 = true;
            }else{// special char
                r4 = true;
            }
            if (r2 && r3 && r4 && r5){
                break;
            }
        }
       boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        return isStrongPassword;
    }
}
