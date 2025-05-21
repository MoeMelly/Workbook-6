public class BankAccount implements Valuable {
    String name;
    String accNumber;
    double balance;



    public BankAccount(String name, String accNumber,double balance) {
        this.name = name;
        this.accNumber = accNumber;
        this.balance = balance;
    }



    public String getName() {
        return name;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {

        return amount;
    }

    public double withdraw(double amount) {

        return amount;
    }


    @Override
    public double getValue() {
        return 0;
    }
}
