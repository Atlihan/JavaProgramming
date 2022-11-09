package day37_Inheritance_Superkeyword.scrumTask;

public class BusinessAnalyst extends Employee {


    public BusinessAnalyst(String name, char gender, int age, int ID, double salary, String companyName) {
        super(name, gender, age, "Business Analyst", ID, salary, companyName);
    }

    public void analyze(){
        System.out.println(name+ " is analyzing the docs");
    }
}
