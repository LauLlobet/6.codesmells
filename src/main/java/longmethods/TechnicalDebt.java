package longmethods;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TechnicalDebt {
    private List<Issue> issues = new ArrayList<>();
    private String lastIssueDate;
    private float total;

    public void register(float effortManHours, String description) {
        if (effortManHours > 1000 || effortManHours <= 0)
        {
            throw new IllegalArgumentException("Cannot register tech debt where effort is bigger than 1000 man hours to fix");
        }

        Priority priority = Priority.LOW;

        if (effortManHours > 100)
        {
            priority = Priority.MEDIUM;
        }

        if (effortManHours > 250)
        {
            priority = Priority.HIGH;
        }

        if (effortManHours > 500)
        {
            priority = Priority.CRITICAL;
        }

        total += effortManHours;

        issues.add(new Issue(effortManHours, description, priority));

        LocalDate now = LocalDate.now();
        lastIssueDate = now.getDayOfMonth() + "/" + now.getMonthValue() + "/" + now.getYear();
    }

    public void fixed(float amount) {
        total -= amount;
    }

    public float total() {
        return total;
    }

    public Issue getLastIssue() {
        return issues.get(issues.size()-1);
    }

    public String lastIssueDate() {
        return lastIssueDate;
    }
}
