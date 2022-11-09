package day24_CustomMethod_Return;

public class ReturnMethodPractise3 {

    public static void main(String[] args) {

        // if we need to find the unique character\ we need to find the frequency of each character
        String str = "aaabcccd";

        // frequency(str,'a'); return type of this method is int variable so==>
        //int frequency = frequency(str,'a');// in order to find the unique, we need to repeat this step for all ch.
        // so we use for each loop==>

        for (int i = 0; i < str.length(); i++) {
            int frequency = frequency(str,str.charAt(i));// to repeat for al ch\ we use i for all ch

            if (frequency==1){
                System.out.println(str.charAt(i));
            }

        }

    }

    public static int frequency (String str, char ch){

        int count = 0;
        for (char each : str.toCharArray()) {
            if(each== ch){
                count++;
            }
        }
        return count;
    }
}
