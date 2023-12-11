import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends Account {
    private LocalDate lastDepositDate;

    public DepositAccount(double initialBalance) {
        super(initialBalance);
        this.lastDepositDate = LocalDate.now();
    }

    @Override
    public void putAmount(double amount) {
        super.putAmount(amount);
        lastDepositDate = LocalDate.now();
    }

    @Override
    public void takeAmount(double amount) {
        LocalDate currentDate = LocalDate.now();
        long monthsBetween = ChronoUnit.MONTHS.between(lastDepositDate, currentDate);

        if (monthsBetween >= 1) {
            super.takeAmount(amount);
        } else {
            System.out.println("Невозможно вывести средства в течении 1 месяца с поледнего пополнения.");
        }
    }

    public void setLastDepositDate(LocalDate date) {
        this.lastDepositDate = date;
    }
}
