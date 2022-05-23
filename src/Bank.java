import java.util.*;

public class Bank {
    ArrayList<BankAccount> accounts = new ArrayList<>();

    public void OpenAcc(int accNo, String accName, int type) {
        //0 for account,1 for current account,2 for Junior Account
        for (int i = 0; i < accounts.size(); i++) {//检测账户号是否可用
            if (accounts.get(i).getAccNo() == accNo) {
                System.out.println("Same Account Number!");
                return;
            }
        }
        if (type == 0) {
            accounts.add(new BankAccount(accName, accNo));
        } else if (type == 1) {
            accounts.add(new CurrentAccount(accNo, accName));
        }else if (type==2) {
            accounts.add(new JuniorAccount(accNo, accName));
        } else {
            System.out.println("Don't have this account!");
        }
    }

    public void closeAcc(int accNo) {
        int flag = 0;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccNo() == accNo) {
                accounts.remove(i);
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("account" + accNo + "Not Found\n");
        }
    }

    //code for lab3
    public void suspend(int accNo) {
        int flag = 0;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccNo() == accNo) {
                accounts.get(i).setIsSuspend(true);
                flag = 1;
                System.out.println("account" + accNo + "has been suspended");
            }
        }
        if (flag == 0) {
            System.out.println("account" + accNo + "Not Found\n");
        }
    }

    public void deposit(int accNo, double amount) {
        int flag = 0;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccNo() == accNo) {
                if (accounts.get(i).getIsSuspend()) {
                    System.out.println("This account is suspended!\n");
                } else {
                    accounts.get(i).deposit(amount);
                }
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("account" + accNo + "Not Found\n");
        }
    }

    public void withdraw(int accNo, double amount) {
        int flag = 0;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccNo() == accNo) {
                if (accounts.get(i).getIsSuspend()) {
                    System.out.println("This account is on suspend!\n");
                    return;
                } else {
                    accounts.get(i).withdraw(amount);
                }
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("account" + accNo + "Not Found\n");
        }
    }

    public void check(int accNo){
        int flag = 0;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccNo() == accNo) {
                if (accounts.get(i).getBalance()<0){
                    sendMessage();
                }
                else{
                    System.out.println(accounts.get(i).getBalance());
                }
                flag=1;
            }
        }
        if (flag == 0) {
            System.out.println("account" + accNo + "Not Found\n");
        }
    }

    public void sendMessage(){
        System.out.println("Your account is overdraft:\n");
    }
}
