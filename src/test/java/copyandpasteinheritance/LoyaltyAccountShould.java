package copyandpasteinheritance;

import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LoyaltyAccountShould {

    private static final LocalDate NOW = LocalDate.now();

    @Test
    public void
    deduct_amount_from_balance_record_transaction_and_update_last_debit_date() {
        LoyaltyAccount loyaltyAccount = new LoyaltyAccount();

        loyaltyAccount.credit(100f);
        loyaltyAccount.debit(50f);

        String lastTransactionDate = loyaltyAccount.lastTransactionDate();

        assertThat(loyaltyAccount.balance(), is(50f) );
        assertThat(lastTransactionDate, is(NOW.getDayOfMonth() + "/" + NOW.getMonthValue() + "/" + NOW.getYear()));
    }
}
