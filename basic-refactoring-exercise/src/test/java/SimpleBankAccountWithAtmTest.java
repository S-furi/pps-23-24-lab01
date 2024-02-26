import org.junit.jupiter.api.BeforeEach;

import example.model.AccountHolder;
import example.model.BankAccount;

public class SimpleBankAccountWithAtmTest {
    private BankAccount bankAccount;
    private AccountHolder accountHolder;

    @BeforeEach
    void setUp() {
        this.accountHolder = new AccountHolder("Stefano", "Furi", 0);
        this.bankAccount = new SimpleBankAccountWithAtm(this.accountHolder);
    }
}
