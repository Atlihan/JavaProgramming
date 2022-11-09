package day37_Inheritance_Superkeyword.scrumTask;

public class Employee extends Person {

    public String jobTitle;
    public int ID;
    public double salary;
    public String companyName;

    public Employee(String name, char gender, int age, String jobTitle, int ID, double salary, String companyName) {
        super(name, gender, age);
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
        this.companyName = companyName;
    }
    public void work(){
        System.out.println(jobTitle+" "+ name+ " is working");

    }

    @Override
    public String toString() {
        return "Employee{" +
                " name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary= $" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
