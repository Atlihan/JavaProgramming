package day43_Abstraction.employee;

public final class Developer extends Employee {
    public Developer(String name, int age, char gender, int ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ " "+ " is writing code");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" "+" is sleeping 8 hours");
    }

    public void unitTest(){
        System.out.println(getName()+" "+" is unit testing");
    }
}
