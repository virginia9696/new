package Bank;

public class Client {
    private Address Address;
    private BankAccount bankAccount;
//
//   public Client(Address Address, BankAccount bankAccount){
//       this.Address=Address;
//       this.bankAccount=bankAccount;
//   }

    public Bank.Address getAddress() {
        return Address;
    }
    public void setAddress(Bank.Address address) {
        Address = address;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
