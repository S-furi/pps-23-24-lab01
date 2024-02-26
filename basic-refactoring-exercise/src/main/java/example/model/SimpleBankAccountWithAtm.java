package example.model;

public class SimpleBankAccountWithAtm extends AbstractBankAccount {
    public static final double ATM_FEE = 1.0;

    public SimpleBankAccountWithAtm(final AccountHolder accountHolder, final double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void deposit(final int userID, final double amount) {
        super.deposit(userID, amount - ATM_FEE);
    }

    @Override
    public void withdraw(final int userID, double amount) {
        super.withdraw(userID, amount + ATM_FEE);
    }
}
