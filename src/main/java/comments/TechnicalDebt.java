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
        throwIfEffortManHoursExceedMax(effortManHours);
        total += effortManHours;
        recordIssue(new Issue(effortManHours, description));
        lastIssueDate = getDateIn_ddMMYY();
    }

    private void recordIssue(Issue issue) {
        issues.add(issue);
    }

    private String getDateIn_ddMMYY() {
        LocalDate now = LocalDate.now();
        return now.getDayOfMonth() + "/" + now.getMonthValue() + "/" + now.getYear();
    }

    private void throwIfEffortManHoursExceedMax(float effortManHours) throws IllegalArgumentException{
        if (effortManHours > 1000) {
            throw new IllegalArgumentException("Cannot register tech debt where effort is bigger than 1000 man hours to fix");
        }
    }

    public void fixed(float amount) {
        total -= amount;
    }

    public String lastIssueDate() {
        return lastIssueDate;
    }
}
