package day08_IfStatements;

public class SalaryCalculator {

    public static void main(String[] args) {
        int hourlyRate = 50,
                weeklyHours = 45;
        double stateTaxRate = 6.5,
            federalTaxrate = 26.2;
                    //.........................
        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double federalTax = salaryBeforeTax * federalTaxrate / 100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        //....................................
        System.out.println("Gross pay is = $ " +salaryBeforeTax);
        System.out.println("State Tax = $ " +stateTax);
        System.out.println("Federal Tax = $" +federalTax);
        System.out.println("Total Tax = $" +totalTax);
        System.out.println("Net incoe = $" +salaryAfterTax);

    }
}

/* 1.Declare the following variables:
    hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

2. Calculate:
Salary Before Tax:
State Tax:
FederalTax:
Total Tax:
Net Income:
 */