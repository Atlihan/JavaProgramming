package week07;

import java.util.Random;

public class RandomPassword {

    public static void main(String[] args) {

        Random random = new Random();
        
        // to create random password include 8 caharacter with random index

        String source = "ABCDEFGHIJKLMNOPRSTUVYZabcdefghijklmnoprstuvyz1234567890!@#";
        int randomIndex = random.nextInt(source.length());
        String password = "";

        for (int i = 0; i <8 ; i++) {
            randomIndex=random.nextInt(source.length());
            password+= source.charAt(randomIndex);
        }
        System.out.println("Password: "+ password);

    }
}
