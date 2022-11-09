package day39_Recap.cydeoTask;

public class Cydeo {

    public static void main(String[] args) {

        Developer developer = new Developer("Sally", 25, 'F', 12, " Java Dev", 15000);

        Tester tester = new Tester("Olga", 33, 'F', 13, "SDET", 110000);

        Teacher teacher = new Teacher("Jack", 45, 'M', 15, "Math Teacher", 15000);

        Student student = new Student("Tom", 22, 'M', 6, "SDET");

        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("--------------------");

        developer.setAge(39);
        System.out.println(developer.getAge());
        System.out.println(developer);

        System.out.println("------------------------");

        developer.work();//Java Dev Sally is developing application
        tester.work();//Olga SDET  is testing application
        teacher.work();//Math Teacher Jack is teaching

        System.out.println("-------------------------");

        developer.eat();
        developer.drink();

        System.out.println("--------------------------");

        tester.eat();
        tester.sleep();

        System.out.println("------------------------");

        student.eat();
        student.drink();
        student.sleep();
    }
}

