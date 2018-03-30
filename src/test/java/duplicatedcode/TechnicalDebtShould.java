package duplicatedcode;



import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TechnicalDebtShould {
    @Test
    public void
    add_amount_from_balance_record_transaction_and_update_last_debit_date() {
        TechnicalDebt account = new TechnicalDebt();
        LocalDate now = LocalDate.now();

        account.register(50f, "Some technical debt");

        Issue lastTransaction = account.getLastTransaction();
        assertThat(lastTransaction.getEffortManHours(), is(50f));
        assertThat(account.lastTransactionDate(), is(now.getDayOfMonth() + "/" + now.getMonthValue() + "/" + now.getYear()));
    }
    
    @Test
    public void
    deduct_amount_from_balance_record_transaction_and_update_last_debit_date() {
        TechnicalDebt account = new TechnicalDebt();
        LocalDate now = LocalDate.now();

        account.register(100f, "Some technical debt");
        account.fix(50f, "Fix technical debt");

        Issue lastTransaction = account.getLastTransaction();
        assertThat(account.balance(), is(50f));
        assertThat(lastTransaction.getEffortManHours(), is(-50f));
        assertThat(account.lastTransactionDate(), is(now.getDayOfMonth() + "/" + now.getMonthValue() + "/" + now.getYear()));

    }
}
