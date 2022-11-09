package day33_Statics;

import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Sally");

        Student student2 = new Student("Jack", 'M');

        Student student3 = new Student("Sam", 11);

        Student student4 = new Student("Tom", 12, 'A');

        Student student5 = new Student("Ali", 'M', 45);

        Student student6 = new Student("Jane", 'F', 25, 45);

        Student student7 = new Student("Marry", 'F', 22, 43, 'C');


        Student [] students = {student1, student2, student3, student4, student5, student6, student7};

        System.out.println(Arrays.toString(students));


    }
}
