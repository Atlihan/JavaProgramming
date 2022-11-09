package day36_Inheritance.encapsulation;

public class StudentObject {

    public static void main(String[] args) {

        Student student1 = new Student("Daniel", 29, 'M', 'D', "MIT");
        student1.setAge(32);
        System.out.println(student1);//Student{name='Daniel', age=32, gender=M, grade=D, schoolName='MIT'}

    }
}
