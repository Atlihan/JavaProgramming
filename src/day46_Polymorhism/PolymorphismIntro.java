package day46_Polymorhism;

import day43_Abstraction.employee.Developer;
import day43_Abstraction.employee.Employee;
import day43_Abstraction.employee.Teacher;
import day43_Abstraction.employee.Tester;

import java.util.ArrayList;

public class PolymorphismIntro {

    public static void main(String[] args) {

        Employee tester = new Tester("Jack", 20, 'M', 23, "SDET", 12000);
        Employee developer  =new Developer("Saly", 25, 'F', 24, "Web dev", 13000);
        Employee teacher = new Teacher("Tom", 35, 'M', 12, "English Teacher", 17000);

        ArrayList<Employee> cydeoEmployees=  new ArrayList<>();
    }
}
