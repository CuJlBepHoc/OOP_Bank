import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Account regularAccount = new Account(1000);
        regularAccount.putAmount(500);
        regularAccount.takeAmount(200);
        System.out.println("Баланс лицевого счета: " + regularAccount.getAmount());

        CreditAccount creditAccount = new CreditAccount(1000);
        creditAccount.putAmount(500);
        creditAccount.takeAmount(200);
        System.out.println("Баланс кредитного счета: " + creditAccount.getAmount());

        DepositAccount depositAccount = new DepositAccount(1000);
        depositAccount.putAmount(500);

        depositAccount.setLastDepositDate(LocalDate.now().minusDays(14));

        depositAccount.takeAmount(200);
        System.out.println("Баланс депозитного счета: " + depositAccount.getAmount());
    }
}
