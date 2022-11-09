package day37_Inheritance_Superkeyword.scrumTask;

public class ProductOwner extends Employee{
    public ProductOwner(String name, char gender, int age,  int ID, double salary, String companyName) {
        super(name, gender, age, "Product Owner", ID, salary, companyName);
    }
}
