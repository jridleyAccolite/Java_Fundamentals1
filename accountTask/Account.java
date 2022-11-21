package accountTask;/*
Create a class accountTask.Account with the attributes accountNo – int, accountType – String,
accountBalance – int and methods setAccountDetails() which set the values to these
attributes, withdraw() which subtracts the given amount from the available balance,
deposit() which adds given amount to the available balance and dispAccountDetails()
which displays accountNo, accountType, accountBalance. Create a class Main1 which
contains main() method to test the functionality of accountTask.Account class.
 */

// see class accountTask.Banking.java

public class Account {
    private int accountNo;
    private String accountType;
    private float accountBalance;

    void setAccountDetails(int number, String type, float balance){
        this.accountNo = number;
        this.accountType = type;
        this.accountBalance = balance;
    }
    void withdraw(float amount){
        if (amount > 0) {
            if (amount < this.accountBalance) {
                System.out.println("Withdrawing £" + amount + " from account " + this.accountNo + "\n");
                this.accountBalance -= amount;
            } else {
                System.out.println("Not enough balance to make withdrawal. Withdrawal rejected.");
            }
        }
        else{
            System.out.println("Error: withdrawal amount must be positive");
        }
    }
    void deposit(int amount){
        if (amount > 0) {
            System.out.println("Depositing £" + amount + " into account " + this.accountNo + "\n");
            this.accountBalance += amount;
        }
        else{
            System.out.println("Error: deposit amount must be positive");
        }
    }
    void dispAccountDetails(){
        System.out.println("accountTask.Account details:\naccountTask.Account Number: " + accountNo + "\naccountTask.Account Type: " +
                this.accountType + "\naccountTask.Account Balance: £" + this.accountBalance + "\n");
    }
}


