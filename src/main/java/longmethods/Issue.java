package longmethods;

public class Issue {
    private Priority priority;

    public Issue(float effortManHours, String description, Priority priority) {
        this.priority = priority;
    }

    public Issue(float effortManHours, String description) {
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
}
