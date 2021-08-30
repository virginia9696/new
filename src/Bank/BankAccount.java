package Bank;

public class BankAccount {
    private double money;
    private String accountNumber;

//    public BankAccount (double money, String accountNumber){
//        this.money=money;
//        this.accountNumber=accountNumber;
//    }

    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
