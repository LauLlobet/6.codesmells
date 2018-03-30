package comments;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TechnicalDebt {
    private final List<Issue> issues = new ArrayList<>();
    private float total;
    private String lastIssueDate;

    public float getTotal() {
        return total;
    }


    public void register(float effortManHours, String description) {
        // check effort does not exceed max allowed
        if (effortManHours > 1000) {
            throw new IllegalArgumentException("Cannot register tech debt where effort is bigger than 1000 man hours to fix");
        }

        // deduct amount from total
        total += effortManHours;

        // record issue
        issues.add(new Issue(effortManHours, description));

        // update last issue date
        LocalDate now = LocalDate.now();
        lastIssueDate = now.getDayOfMonth() + "/" + now.getMonthValue() + "/" + now.getYear();
    }

    public void fixed(float amount) {
        total -= amount;
    }

    public String lastIssueDate() {
        return lastIssueDate;
    }
}
