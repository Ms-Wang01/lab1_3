public class JuniorAccount extends BankAccount{
    //this account is only for teenagers whose age are below 16
    public JuniorAccount(int accNo, String accName){
        super(accNo, accName);
        System.out.println("Only customers under the age of 16 may open a Junior account.");
    }
    public JuniorAccount(String accName,int accNo){
        super(accName,accNo);
        System.out.println("Only customers under the age of 16 may open a Junior account.");
    }
}
