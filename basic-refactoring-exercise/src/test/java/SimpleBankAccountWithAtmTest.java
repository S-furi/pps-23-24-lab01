import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import example.model.AccountHolder;
import example.model.BankAccount;
import example.model.SimpleBankAccountWithAtm;

public class SimpleBankAccountWithAtmTest {
    private BankAccount bankAccount;
    private AccountHolder accountHolder;

    private static final double TEST_DEPOSIT_BALANCE = 100.0;

    @BeforeEach
    void setUp() {
        this.accountHolder = new AccountHolder("Stefano", "Furi", 0);
        this.bankAccount = new SimpleBankAccountWithAtm(this.accountHolder, 0.0);
    }

    @Test
    void testEmptyBankAccount() {
        assertEquals(this.bankAccount.getBalance(), 0.0);
    }

    @Test
    void testDeposit() {
        this.bankAccount.deposit(this.accountHolder.getId(), TEST_DEPOSIT_BALANCE);
        assertEquals(this.bankAccount.getBalance(), TEST_DEPOSIT_BALANCE - SimpleBankAccountWithAtm.ATM_FEE);
    }

    @Test
    void testWithdraw() {
        this.bankAccount.deposit(this.accountHolder.getId(), TEST_DEPOSIT_BALANCE);
        double withdrawAmount = 50.0;

        this.bankAccount.withdraw(this.accountHolder.getId(), withdrawAmount);

        double expectedBalance = TEST_DEPOSIT_BALANCE - withdrawAmount - SimpleBankAccountWithAtm.ATM_FEE;
        assertEquals(expectedBalance, this.bankAccount.getBalance());
    }
}
