package day37_Inheritance_Superkeyword.scrumTask;

public class Tester extends Employee {

    public Tester(String name, char gender, int age, String jobTitle, int ID, double salary, String companyName) {
        super(name, gender, age, jobTitle, ID, salary, companyName);
    }

    public void createTicket (){
        System.out.println(jobTitle+ " "+ name+ " is creating ticket");
    }
}
