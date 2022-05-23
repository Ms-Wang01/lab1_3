
public class CurrentAccount extends BankAccount {
    double overdraft_limit;

    public CurrentAccount(int accNo, String accName) {
        super(accNo, accName);
        this.overdraft_limit = 500.0;
    }

    public CurrentAccount(String accName, int accNo) {
        super(accName, accNo);
        this.overdraft_limit = 500.0;
    }

    public void withdraw(double amount) {
        if (amount > this.getBalance() + this.overdraft_limit) {
            System.out.println("Out of the overdraft limit");
        } else if (this.getBalance() >= (amount - 500)) {
            setBalance(this.getBalance() - amount);
        } else {
            setBalance(0);
            overdraft_limit = 500 - (amount - getBalance());
        }
    }

    public String toString() {
        return "Current Account\nAccount number: " + this.getAccNo() + "\n"
                + "Account name: " + this.getAccName() + "\n"
                + "Balance: " + this.getBalance() + "\n"
                + "isSuspend" + this.getIsSuspend();
    }
}