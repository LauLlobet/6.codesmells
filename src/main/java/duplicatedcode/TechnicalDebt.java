package duplicatedcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TechnicalDebt {
    private List<Issue> transactions = new ArrayList<>();
    private String lastTransactionDate;
    private float balance;

    public void register(float effortManHours, String description) {
        float effortManHours1 = -effortManHours;
        balance -= effortManHours1;
        transactions.add(new Issue(-effortManHours1, description));
        LocalDate now = LocalDate.now();
        this.lastTransactionDate = now.getDayOfMonth() + "/" + now.getMonthValue() + "/" + now.getYear();
    }

    public void fix(float effortManHours, String description) {
        this.balance -= effortManHours;
        transactions.add(new Issue(-effortManHours, description));
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
