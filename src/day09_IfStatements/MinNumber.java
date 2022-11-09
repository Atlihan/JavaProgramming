package day09_IfStatements;

public class MinNumber {

    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 200;
        boolean n1IsMinNum = n1<n2;
        boolean n2IsMinNum = n2<n1;
        boolean equal = n1 == n2;

        if(n1IsMinNum){
            System.out.println(n1 + " is the minimum number");
        }

        if(n2IsMinNum) {
            System.out.println(n2 + " is the minimum number");
        }

        if(equal) {
            System.out.println(equal + " n1 is equal to n2");
        }

    }
}
// create an output for 3 conditions : n1<n2, n2<n1 and n1 = n2
