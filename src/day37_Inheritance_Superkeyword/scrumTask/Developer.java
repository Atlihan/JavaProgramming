package day37_Inheritance_Superkeyword.scrumTask;

public class Developer extends Employee{

    public Developer(String name, char gender, int age, String jobTitle, int ID, double salary, String companyName) {
        super(name, gender, age, jobTitle, ID, salary, companyName);
    }

    public void fixBugs(){
        System.out.println(jobTitle+ " "+ name+ " is fixing bugs");
    }

}
