package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {

    public static void main(String[] args) {

        //Str = "Java Java Java Python" Delete the Java in sentence

        String str = "Java Java Java Python";
        int frequency = 0;

        while (str.contains("Java")){

            str = str.replaceFirst("Java", "");
            frequency++;
        }
        System.out.println("frequency = " + frequency);

        System.out.println("========================");

        String sentence = "cat cat cat cat dog dog cat cat";
        int countCat = 0;// how many times we delete
        // if we have CAT, Cat etc in the sentence, then we add > sentence = sentence.toLowerCase();


        while (sentence.contains("cat")){
            sentence = sentence.replaceFirst("cat","");
            countCat++;
        }
        System.out.println("countCat = " + countCat);

        System.out.println("===========================================");

        String s = " java java python python";// if we want to remove two words in a sentence:

        int countJava =0;
        int countPython = 0;

        while (s.contains("java")|| s.contains("python")){
            if(s.contains("java")){
                s = s.replaceFirst("java", "");
                countJava++;
            }
            if(s.contains("python")){
                countPython ++;
            }
        }
        System.out.println("countPython = " + countPython);
        System.out.println("countJava = " + countJava);




    }


}
