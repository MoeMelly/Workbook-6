public class CreditCard extends BankAccount implements Valuable {
  String name;
  String accNumber;
  double balance;


  public CreditCard(String name, String accNumber, double balance) {
      super(name, accNumber, balance);
      this.name = name;
      this.accNumber = accNumber;
      this.balance = balance;

  }
  
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAccNumber() {
        return accNumber;
    }

    @Override
    public double getBalance() {
        return balance;
    }









    @Override
    public double getValue() {
        return 0;
    }
}
