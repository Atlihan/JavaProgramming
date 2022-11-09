package day37_Inheritance_Superkeyword.scrumTask;

public class ScrumMaster extends Employee{

    public ScrumMaster(String name, char gender, int age, int ID, double salary, String companyName) {
        super(name, gender, age, "Scrum master", ID, salary, companyName);
    }

}
