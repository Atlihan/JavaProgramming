package day17_While_DoWhile;

public class FrequencyOfWord {

    public static void main(String[] args) {
        //write a program that can return the frequency of a word in a sentence "JavaJavaJava"
        // we prefer subString to find how many words in sentence

        String sentence = "JavaJava ";
        //                 01234567: in total we have 7 ch

        int frequency = 0;
        for (int i = 0; i <= sentence.length()-4; i++) {//-4: because we have 7 ch, after  4th ch, total number of lenght becomes bigger than 7
            // in order to exceed the number of length we write -4

            String eachSub= sentence.substring(i, i +4);// the word Java has 4 character

            if(eachSub.equals("Java")){
                frequency++;
            }

        }
        System.out.println("frequency = " + frequency);

    }
}
