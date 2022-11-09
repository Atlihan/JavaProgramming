package day43_Abstraction.employee;

public final class Tester extends Employee {
    public Tester(String name, int age, char gender, int ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ " "+ " is testing the app");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" "+" is sleeping 8 hours");
    }

    public void bugReporting (){
        System.out.println(getName()+ " "+ " is creating bug reports");
    }
}
