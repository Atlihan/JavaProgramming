package day28_ArrayList;

public class StrongPassword2 {

    public static void main(String[] args) {

        String password = "cLdeo1990@";

        int countUppercase = 0;
        int countLowercase = 0;
        int countDigit= 0;
        int countSpecialChar = 0;


        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if(Character.isUpperCase(each)){
                countUppercase++;
            }else if(Character.isLowerCase(each)){
                countLowercase++;
            }else if(Character.isDigit(each)){
                countDigit++;
            }else{
                countSpecialChar++;
            }

        }
        System.out.println("countUppercase = " + countUppercase);//1
        System.out.println("countSpecialChar = " + countSpecialChar);//1
        System.out.println("countLowercase = " + countLowercase);//4
        System.out.println("countDigit = " + countDigit);//4

        boolean hasUpperCase = countUppercase > 0;
        boolean hasLowercase = countLowercase > 0;
        boolean hasSpecialChar = countSpecialChar > 0;
        boolean hasDigit = countDigit > 0;

       // 1 st solution : boolean strongPassword = password.length() >= 8 && !password.contains(" ") && hasUpperCase && hasLowercase && hasSpecialChar && hasDigit;

        boolean strongPassword = false;
        // 2 nd solution with Nested If Statement
        if (password.length()>=8){
            if (!password.contains(" ")){
                if (hasUpperCase){
                    if (hasLowercase){
                        if (hasSpecialChar){
                            if (hasDigit){
                                strongPassword = true;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("strongPassword = " + strongPassword);


    }
}
