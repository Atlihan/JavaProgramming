package day16_ForLoop_StringPractises;

public class RemoveDublicates {

    public static void main(String[] args) {

        String word  ="aabbaacc";
        String result = ""; // the character that is not contained then it is added to result
        for (int i = 0; i < word.length(); i++) {
            String ch = ""+ word.charAt(i);// represents each character in the word

            if(!result.contains(ch)){//If the character that is not contained in the result:
                result += ch;
            }

        }
        System.out.println(result);


    }
}
