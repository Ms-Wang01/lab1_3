public class BankAccount {
    private int accNo;
    private String accName;
    private double balance;
    private boolean isSuspend;

    public BankAccount(int accNo, String accName) {
        this.accNo = accNo;
        this.accName = accName;
        this.balance = 0.0;
        this.isSuspend = false;
    }

    public BankAccount(String accName, int accNo) {
        this.accNo = accNo;
        this.accName = accName;
        this.balance = 0.0;
        this.isSuspend = false;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean getIsSuspend() {
        return isSuspend;
    }

    public void setIsSuspend(boolean isSuspend) {
        this.isSuspend = isSuspend;
    }

    public void deposit(double amount) {
            balance = balance + amount;
    }

    public void withdraw(double amount) {
        if(balance >= amount ){
            balance = balance - amount;
        }else{
            System.out.println("You don't have enough money!");
        }
    }


    public String toString() {
        return "Bank Account\nAccount number: " + accNo + "\n"
                + "Account name: " + accName + "\n"
                + "Balance: " + balance + "\n"
                + "isSuspend" + isSuspend;
    }
}
