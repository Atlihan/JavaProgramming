package day04_Variables;

/*
Create a class named EmployeeInfo. declare the following
variables:
1. name (String)
2. age (int)
3. gender (char)
4. company (String)
5. jobTitle (String)
6. yearsOfExpereince (double)
7. salary (int)
8. isFullTime (boolean)
9. isMarried (boolean)
10. employeeId (String)
11. SSN (String)
 */
public class EmplyeeInfo {
    public static void main(String[] args) {

        String name = " Maria";
        int age = 24;
        char gander = 'F';
        String company = "Apple Inc";
        String jobTitle = "SDET";
        double yearsOfExperience = 2.2;
        int salary = 120000;
        boolean isFullTime = true;
        boolean isMarried = false;
        String employeeID = "A101";
        String SSN = "(123)-45-678";

        System.out.println("name = " + name);
        System.out.println("employeeID = " + employeeID);
        System.out.println("gander = " + gander);
        System.out.println("age = " + age);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("company = " + company);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("salary = " + salary);
        System.out.println("isMarried = " + isMarried);



    }
}
