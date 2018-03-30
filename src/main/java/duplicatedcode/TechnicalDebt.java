package duplicatedcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TechnicalDebt {
    private List<Issue> transactions = new ArrayList<>();
    private String lastTransactionDate;
    private float balance;

    public void register(float effortManHours, String description) {
        accumulateBalanceAndStoreTransaction(-effortManHours,description);
        setLasTransactionDateToNow();
    }

    /*
    possible alternative that would break the domain Ubiquous Language in some cases
     I have no vocabulary to express the sign-less operation in terms of the domain
     I would say : "applyDifferenceInBalanceAndStoreTransaction"
     */

    public void register2(float effortManHours, String description) {
        fix(-effortManHours,description);
    }


    public void fix(float effortManHours, String description) {
        accumulateBalanceAndStoreTransaction(effortManHours,description);
        setLasTransactionDateToNow();
    }

    private void accumulateBalanceAndStoreTransaction(float effortManHours, String description) {
        balance -= effortManHours;
        transactions.add(new Issue(-effortManHours, description));
    }

    private void setLasTransactionDateToNow() {
        LocalDate now = LocalDate.now();
        this.lastTransactionDate = now.getDayOfMonth() + "/" + now.getMonthValue() + "/" + now.getYear();
    }

    public Issue getLastTransaction() {
        return transactions.get(transactions.size()-1);
    }

    public String lastTransactionDate() {
        return lastTransactionDate;
    }

    public float balance() {
        return balance;
    }
}
