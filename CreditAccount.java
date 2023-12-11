public class CreditAccount extends Account {
    public CreditAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void takeAmount(double amount) {
        double commission = amount * 0.01;
        super.takeAmount(amount + commission);
    }
}
