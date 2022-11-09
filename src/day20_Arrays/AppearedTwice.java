package day20_Arrays;

public class AppearedTwice {

    public static void main(String[] args) {

        char [] chars ={ 'A','A', 'A','C','A','C','B','B'};

        for (int j = 0; j < chars.length; j++) {
            char ch = chars[j];// each ch in array chars
            int frequency = 0;
            for (int i = 0; i < chars.length; i++) {//
                if (chars[i]==ch){
                    frequency++;
                }
        }
           if (frequency==2)
            System.out.println(ch);

        }
    }
}
