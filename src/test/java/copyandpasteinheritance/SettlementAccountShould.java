package copyandpasteinheritance;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SettlementAccountShould {
    private static final LocalDate NOW = LocalDate.now();
    private SettlementAccount settlementAccount;

    @Before
    public void setUp() {
        settlementAccount = new SettlementAccount();
    }

    @Test
    public void
    deduct_amount_from_balance_record_transaction_and_update_last_debit_date() {

        settlementAccount.credit(100f);
        settlementAccount.debit(50f);

        String lastTransactionDate = settlementAccount.lastTransactionDate();

        assertThat(settlementAccount.balance(), is(50f) );
        assertThat(lastTransactionDate, is(NOW.getDayOfMonth() + "/" + NOW.getMonthValue() + "/" + NOW.getYear()));
    }

    @Test
    public void
    settling_deduct_owing_from_balance() {
        settlementAccount.credit(100);
        settlementAccount.borrow(50);
        settlementAccount.settle();

        assertThat(settlementAccount.balance(), is(50f) );
    }
}
