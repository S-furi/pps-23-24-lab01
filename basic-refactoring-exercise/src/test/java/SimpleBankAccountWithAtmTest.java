import org.junit.jupiter.api.BeforeEach;

import example.model.AccountHolder;

public class SimpleBankAccountWithAtmTest {
    private final SimpleBankAccountWithAtm bankAccount;
    private final AccountHolder accountHolder;

    @BeforeEach
    void setUp() {
        this.accountHolder = new AccountHolder("Stefano", "Furi", 0);
        this.bankAccount = new SimpleBankAccountWithAtm(this.accountHolder);
    }
}
