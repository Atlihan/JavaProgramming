package day31_Constructors;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Jack", 25, 'M', 'B', 12);

        Student student2 = new Student("Sally", 20, 'F', 'A', 15);

        System.out.println(student1);//Student{name='Jack', age=25, gender=M, grade=B, ID=12}
        System.out.println(student2);//Student{name='Sally', age=20, gender=F, grade=A, ID=15}
    }
}
