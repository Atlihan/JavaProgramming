package day20_Arrays;

public class UniqueElementsOfArray {

    public static void main(String[] args) {

        String[] words = {"Java", "Java", "C#", "Python", "Python"};

        for (int j = 0; j < words.length; j++) {// Outer Loop selects specific word during each repeating
            // , then that word is compared with each element selected by inner Loop,
            String element = words[j];
            int frequency = 0;//

            for (int i = 0; i < words.length; i++) {

                if (words[i].equals(element)) {// this condition compares each element in the array word by word, by the help of index no
                    frequency++;// then if the element occur in the array,  it increases the frequency
                }
            }
            if (frequency == 1) {
                System.out.println(element);
            }


        }
    }
}
