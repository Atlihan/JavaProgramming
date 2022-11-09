package day30_CustomClasses;

import java.util.ArrayList;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Aygun", 'F', 20, 2210, 'A');

        Student student2 = new Student();
        student2.setInfo("Hulya", 'F', 25, 2212, 'B');

        Student student3 = new Student();
        student3.setInfo("Elminur", 'F', 28, 2245, 'A');

        Student student4 = new Student();
        student4.setInfo("Ali", 'M', 35, 2234, 'B');

        Student student5 = new Student();
        student5.setInfo("Mert", 'M', 44, 2255, 'C');


        Student [] students = {student1, student2, student3, student4, student5};
        for (Student student : students) {
            System.out.println(student);
            /*
            Student{name='Aygun', gender=F, age=20, ID=2210, grade=A}
            Student{name='Hulya', gender=F, age=25, ID=2212, grade=B}
            Student{name='Elminur', gender=F, age=28, ID=2245, grade=A}
            Student{name='Ali', gender=M, age=35, ID=2234, grade=B}
            Student{name='Mert', gender=M, age=44, ID=2255, grade=C}
             */
        }
        System.out.println("-------------------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>();// grade A
        ArrayList<Student> angryBirds = new ArrayList<>();

        for (Student student : students) {

            if (student.grade=='A'){
                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }
        }
        System.out.println(earlyBirds);
        System.out.println(angryBirds);
    }
}
