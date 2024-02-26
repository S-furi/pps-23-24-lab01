import example.model.AccountHolder;
import example.model.BankAccount;

public class SimpleBankAccountWithAtm implements BankAccount {
    private final AccountHolder accountHolder;

    public SimpleBankAccountWithAtm(final AccountHolder accountHolder) {
        this.accountHolder = accountHolder;
    }

    @Override
    public AccountHolder getHolder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHolder'");
    }

    @Override
    public double getBalance() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBalance'");
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
