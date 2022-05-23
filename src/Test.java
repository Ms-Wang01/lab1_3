public class Test {

    public static void main(String[] args) {
        BankAccount account1=new BankAccount(23142635,"John Smith");
        System.out.println(account1);
        account1.deposit(500);
        account1.withdraw(100);
        System.out.println (account1);

        BankAccount account2 = new BankAccount("Tom Will", 38472638);
        System.out.println(account2);
        account2.deposit(100);
        account2.withdraw(400);
        System.out.println(account2);



        CurrentAccount cur_account1=new CurrentAccount("Tom Will",28572638);
        System.out.println(cur_account1);
        account2.deposit(100);
        account2.withdraw(800);
        System.out.println (cur_account1);

        CurrentAccount cur_account2 = new CurrentAccount(231425, "w Smith");
        System.out.println(cur_account2);
        account2.deposit(500);
        account2.withdraw(550);
        System.out.println(account2);



        Bank bank = new Bank();
        bank.OpenAcc(10001,"test1",0);
        bank.deposit(10001,500);
        bank.OpenAcc(10002,"test2",1);
        bank.deposit(10002,500);
        bank.OpenAcc(10003,"test3",1);
        bank.deposit(10003,500);
        bank.OpenAcc(10004,"test4",1);
        bank.deposit(10004,500);
        bank.OpenAcc(10005,"test5",2);
        bank.deposit(10005,500);

        System.out.println("for normal bank account");
        bank.check(10001);
        bank.withdraw(10001,400);
        bank.check(10001);
        bank.withdraw(10001,200);
        bank.check(10001);

        System.out.println("test the current bank account");
        bank.withdraw(10002,400);
        bank.check(10002);
        bank.withdraw(10002,400);
        bank.check(10002);
        bank.withdraw(10002,400);
        bank.check(10002);

        System.out.println("invalid account test");
        bank.withdraw(1,700);
        bank.deposit(1,700);
        bank.check(1);

        System.out.println("close account test");
        bank.closeAcc(10002);
        bank.check(10002);

        System.out.println("suspend account test");
        bank.suspend(10003);
        bank.check(10003);
        bank.deposit(10003,300);
        bank.withdraw(10003,300);
    }

}
