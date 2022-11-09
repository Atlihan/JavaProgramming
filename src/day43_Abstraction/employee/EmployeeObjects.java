package day43_Abstraction.employee;

public class EmployeeObjects {

    public static void main(String[] args) {

        Tester tester = new Tester("Jack", 20, 'M', 23, "SDET", 12000);

        Developer developer  =new Developer("Saly", 25, 'F', 24, "Web dev", 13000);

        Teacher teacher = new Teacher("Tom", 35, 'M', 12, "English Teacher", 17000);

        developer.setAge(30);
        tester.setSalary(14000);

        System.out.println(teacher);
        System.out.println(tester);
        System.out.println(developer);

        tester.work();
        tester.sleep();
        tester.bugReporting();

        developer.eat();
        developer.unitTest();



    }
}
