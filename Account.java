public class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void putAmount(double amount) {
        balance += amount;
    }

    public void takeAmount(double amount) {
        balance -= amount;
    }

    public double getAmount() {
        return balance;
    }
}
