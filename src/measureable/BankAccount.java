package measureable;

public class BankAccount implements Measurable{
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }
    public BankAccount() {
        balance = 0;
    }

    @Override
    public double getMeasure() {
        return balance;
    }
}
