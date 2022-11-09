package day08_IfStatements;

/* write a program that swipe two variables' value by using temporary variable
ex: = if a = 10 b=15

output: a = 15
        b = 10
 */
public class SwapTwoVariables_WithTemporaryVariable {
/*
 If we reassign a value to variable, the old value is gone,
 therefore we should store the old value into an other variable (c)

 */
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = b;// c=15
        b = a; // b=10
        a = c; // a= 15

        System.out.println("a = " + a);
        System.out.println("b = " + b);



    }
}
