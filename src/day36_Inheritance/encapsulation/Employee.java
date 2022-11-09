package day36_Inheritance.encapsulation;

public class Employee {

    /* private variables:
				name, gender, age, salary
			Encapsulate all the private fields
				1. Name can not be empty
				2. gender can not anything other than female or male
				3. age can not be less than 16, and greater than 90
				4. salary can not be zero or negative  */

    private String name;
    private  int age;
    private char gender;
    private double salary;

    public Employee(String name, int age, char gender, double salary) {
        // by using setter in the construction instead of this., we can check whether the instance values are valid
        setName(name);
        setAge(age);
        setGender(gender);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.isEmpty()){
            System.err.println("Please enter a name");
            return;
        }
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if (age < 16 || age > 90){
            return;
        }
        this.age = age;
    }
    public char getGender(){
        return gender;
    }

    public void setGender(char gender){
        if (!(gender == 'M' || gender == 'F')){
            return;
        }
        this.gender = gender;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        if (salary <= 0){
            return;
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary= $" + salary +
                '}';
    }
}
