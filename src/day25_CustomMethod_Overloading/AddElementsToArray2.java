package day25_CustomMethod_Overloading;

public class AddElementsToArray2 {

    public static void main(String[] args) {

        int [] array={1,2,3};

      addElement(array, 8);


    }

    public static int [] addElement(int [] array, int element){

        int [] result = new int[array.length + 1];

        int i =0;// thus we dont know the indexes, assign a variable i
        for (int each : array) {// in order to get the each element of the array, we use for each loop
            result[i++]=each;
        }
        result[i]= element;
        return result;
    }

    public static double[] addElement(double[] array, double element ){
        double []result = new double[array.length+1];
        int i = 0;
        for (double each : array){
            result[i++] = each;
        }
        result[result.length-1] = element;// element needs to be assigned o the last index
        return result;
    }
}
