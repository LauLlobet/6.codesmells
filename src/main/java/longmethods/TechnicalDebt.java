package longmethods;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TechnicalDebt {
    private List<Issue> issues = new ArrayList<>();
    private String lastIssueDate;
    private float total;

    public void register(float effortManHours, String description) {
        Priority priority = Priority.getPriorityFromEffort(effortManHours);

        total += effortManHours;

        issues.add(new Issue(effortManHours, description, priority));

        storeLastIssueDateWithToday();
    }

    private void storeLastIssueDateWithToday() {
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
