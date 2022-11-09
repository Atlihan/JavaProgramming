package day34_Garbage_Collection_AccesModifiers;

public class CydeoStudent {

    public String studentName;
    public static String schoolName;

    public CydeoStudent(String studentName){
        this.studentName = studentName;
       // schoolName = "Cydeo School"; we can add static variable in constructor but it executes with the number of objects
    }
    static {
        schoolName = "Cydeo School";// so the school name repeats only one time
    }

}

class CydeoStudentObject{

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Sally");
        CydeoStudent student2 = new CydeoStudent("Jack");

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);

    }
}
