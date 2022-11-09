package day32_Constructor;

import org.w3c.dom.ls.LSOutput;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Aaron");
        System.out.println(employee1);

        Employee employee2 = new Employee("Sally", 'F');
        System.out.println(employee2);

        Employee employee3 = new Employee("John", 'M', "QA");
        System.out.println(employee3);

        Employee employee4 = new Employee("Ali", 'M', "BA", 15000);
        System.out.println(employee4);

    }
}
