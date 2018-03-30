package longmethods;

public class Issue {
    private float effortManHours;
    private Priority priority;
    private String description;

    public Issue(float effortManHours, String description, Priority priority) {
        this.effortManHours = effortManHours;
        this.description = description;
        this.priority = priority;
    }

    public Issue(float effortManHours, String description) {
        this.effortManHours = effortManHours;
        this.description = description;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
}
