package day41_Exceptions;

import day39_Recap.cydeoTask.Student;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {

        // unchecked exception:

        int a= 10;
        int b= 0;
      //  System.out.println( a / b);

        char [] characters = {'a', 'b', 'c'};
        System.out.println(characters [99]);

        Student student = null;
     //   System.out.println(student.getName());
       // student.study();

        System.out.println("----------------------");

        //checked exception:

       // Thread.sleep(3000);
    }
}
