package day24_CustomMethod_Return;

public class ReturnMethodPractise {

    public static void main(String[] args) {
// create a method to find max number between 100 and 200//and multiply max number by 2
       int maxNumber =  max(100, 200);// by using the return type of max, we can reuse or assign the 200 to another variable (maxNumber)
        System.out.println(maxNumber);

        int multiplication =maxNumber*2;
        System.out.println("multiplication = " + multiplication);
    }

    public static int max(int a, int b){

        int result = 0;
        if(a>b){
            result = a;
        }else{
            result = b;
        }
        return result;
    }

}

