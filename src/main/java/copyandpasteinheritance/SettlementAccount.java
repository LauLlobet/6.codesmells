package copyandpasteinheritance;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SettlementAccount {
    private List<Transaction> transactions = new ArrayList<>();
    private float balance;
    private String lastTransactionDate;
    private float owing;

    public void credit(float amount) {
        executeTransaction(amount);
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

    public void borrow(float amount)
    {
        owing += amount;
    }

    public void settle()
    {
        balance -= owing;
    }
}
