package day21_ForEachLoop;

public class UniqueElements {

    public static void main(String[] args) {

        String[] words = {"Java", "Java", "C#", "Python", "Python"};




        for ( String each : words){// this outer loop gets each element during execution\
            int count = 0;

            for (String element : words){// inner loop compares the element selected by outer loop (like Java vs.) with others in the array to find frequency
                if (element.equals(each)){// that is why we use "each" instead of an element in the array
                    count++; // nimber of frequency
                }
            }
            if (count == 1){// then it gives us the unique element
                System.out.println(each);
            }
        }
    }
}
