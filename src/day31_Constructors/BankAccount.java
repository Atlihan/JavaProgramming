package day31_Constructors;

public class BankAccount {
/*
 Attributes:
	                1. accountHolder, 2. accountNumber, 3. balance

	        Actions:
	        	1. setInfo(): sets the accountHolder and accountNumber attributes
	        	2. toString()
	            3. checkBalance():displays the available balance
	            2. deposit(): increases the balance by the given amount
				3. withdraw(): decreases the balance by the given amount
 */
    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long bankAccount) {
        this.accountHolder = accountHolder;
        this.accountNumber = bankAccount;





    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your available balance is: "+ balance);
    }
    public void deposit (double amount){
        if (amount < 0){
            System.out.println("Depositing amount can not be 0 or negative");
            return;
        }
        balance += amount;

        if (amount>balance){
            System.out.println("");
        }





    }
    public void withdraw (double amount){
        if(amount>balance){
            System.out.println("Insufficient balance");
            return;
        }
        if (amount<0){
            System.out.println("Withdrawing amount can not be 0 or negative");
        }
        balance-=amount;
    }
}
