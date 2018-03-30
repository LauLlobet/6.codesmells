package copyandpasteinheritance;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LoyaltyAccount {
    private List<Transaction> transactions = new ArrayList<>();
    private int loyaltyPoints;
    private float balance;
    private String lastTransactionDate;

    public void credit(float amount) {
        executeTransaction(amount);
        loyaltyPoints++;
    }


    public void debit(float amount) {
        executeTransaction(-amount);
    }

    public float balance() {
        return balance;
    }

    public String lastTransactionDate() {
        return lastTransactionDate;
    }

    private void executeTransaction(float amount) {
        balance += amount;
        recordTransaction(amount);
        updateLastTransactionDate();
    }

    private void updateLastTransactionDate() {
        LocalDate now = LocalDate.now();
        lastTransactionDate = now.getDayOfMonth() + "/" + now.getMonthValue() + "/" + now.getYear();
    }

    private void recordTransaction(float amount) {
        transactions.add(new Transaction(true, amount));
    }
}
