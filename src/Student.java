import java.util.Arrays;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int studentID;
    public char grade;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Student (String name, int studentID){
        this(name);
        this.studentID = studentID;
    }

    public Student (String name,int studentID, char grade) {
        this(name, studentID);
        this.grade = grade;
    }

    public Student (String name, char gender, int age){
        this(name, gender);
        this.age=age;
    }

    public Student(String name, char gender, int age, int studentID) {
        this(name, gender, age);
        this.studentID = studentID;
    }

    public Student(String name, char gender, int age, int studentID, char grade) {
        this(name, gender, age, studentID);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }

}

class StudentObject{

    public static void main(String[] args) {

        day33_Statics.Student student1 = new day33_Statics.Student("Sally");

        day33_Statics.Student student2 = new day33_Statics.Student("Jack", 'M');

        day33_Statics.Student student3 = new day33_Statics.Student("Sam", 11);

        day33_Statics.Student student4 = new day33_Statics.Student("Tom", 12, 'A');

        day33_Statics.Student student5 = new day33_Statics.Student("Ali", 'M', 45);

        day33_Statics.Student student6 = new day33_Statics.Student("Jane", 'F', 25, 45);

        day33_Statics.Student student7 = new day33_Statics.Student("Marry", 'F', 22, 43, 'C');


        day33_Statics.Student[] students = {student1, student2, student3, student4, student5, student6, student7};

        System.out.println(Arrays.toString(students));


    }

}
