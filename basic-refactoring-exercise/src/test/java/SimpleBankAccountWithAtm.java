import example.model.AccountHolder;
import example.model.BankAccount;

public class SimpleBankAccountWithAtm implements BankAccount {
    private final AccountHolder accountHolder;
    private double balance;

    public SimpleBankAccountWithAtm(final AccountHolder accountHolder, final dobule balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    @Override
    public AccountHolder getHolder() {
        return this.accountHolder;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void deposit(int userID, double amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deposit'");
    }

    @Override
    public void withdraw(int userID, double amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'withdraw'");
    }

}
