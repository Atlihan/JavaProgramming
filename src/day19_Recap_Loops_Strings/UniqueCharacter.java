package day19_Recap_Loops_Strings;

public class UniqueCharacter {

    public static void main(String[] args) {
// Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods
//
//    			Ex:
//                        str = "aabccdeef";
//
//                        output:
//                                bdf
//

        String str = "aabccdeef";
        String result = "";


        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char eachCharacter = str.charAt(i);
                if (ch == eachCharacter){
                    count++;
                }
            }
            if (count==1){//
                result += ch;
            }
        }
        System.out.println(result);

    }


}
