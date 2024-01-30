public class BankAccount {
    int accountNumber;
    int balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = Integer.parseInt(accountNumber);
        this.balance = 0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public boolean deposit(double depositAmount) {
        if(depositAmount > 0){
            balance += depositAmount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double withdrawAmount) {
        if(withdrawAmount > 0 && withdrawAmount < balance){
            balance -= withdrawAmount;
            return true;
        }
        return false;
    }
}