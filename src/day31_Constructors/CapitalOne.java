package day31_Constructors;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();

        account1.setInfo("Jack Walsh", 123456788);
        System.out.println(account1);

        account1.deposit(1000);
        account1.checkBalance();

        account1.withdraw(500);
        account1.checkBalance();

        System.out.println("--------------------------");

        BankAccount account2 = new BankAccount();
        account2.setInfo("Sally Cool", 3456789);

        account2.deposit(300);
        account2.checkBalance();
    }
}
