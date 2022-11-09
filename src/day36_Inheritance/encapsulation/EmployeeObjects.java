package day36_Inheritance.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1= new Employee("Tatina", 25, 'F', 110000);


        Employee employee2  =new Employee("Tom", 24, 'M', 100000);

        employee2.setName("Jack");
        employee2.setSalary(employee2.getSalary() + 5000);

        System.out.println(employee1);
        System.out.println(employee2);//Employee{name='Jack', age=24, gender=M, salary= $105000.0}

    }
}
