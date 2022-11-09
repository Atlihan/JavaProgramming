package day19_Recap_Loops_Strings;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        // Write a program that can find the frequency of the characters from a string
        //
        //			 Ex:
        //                        str = "aabcccd";
        //
        //                        output:
        //                                a2b1c3d1

        String str = "aabcccd";
        String result = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);// 'a' after then we replace 0 with j
            int count = 0;// frequency of 'a'

            for (int i = 0; i < str.length(); i++) {// each character ot str and this is only for 'a',
                // so to do this for all character of str wee need another loop
                char each = str.charAt(i);

                if (ch == each) {
                    count++;// frequency
                }
            }

            if (result.contains("" + ch)) {
                continue;
            }
                result += ch;// result for each caharacter
                result += count;// result for the frequency of caharacter
            }
            System.out.println(result);// the first resul is a2a2b1c3c3c3d1 so that we need to skip duplication
            // for this wee need 'continue' to skip/

        }
    }

