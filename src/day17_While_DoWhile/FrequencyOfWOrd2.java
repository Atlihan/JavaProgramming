package day17_While_DoWhile;

public class FrequencyOfWOrd2 {

    public static void main(String[] args) {

        // how many times that the words cat and dog occur?

        String str = "Cat Cat Dog Dog cAT CAT cAt";

        int frequency = 0;

        for (int i = 0; i <= str.length()-3; i++) {// <= str.length() -3;

           String eachSub =  str.substring(i, i+3);
           if(eachSub.equalsIgnoreCase("Cat")){
               frequency++;
           }

        }
        System.out.println("frequency = " + frequency);
    }
}
