package dataclasses;

public class Issue {
    private final int effortManHours;
    private final String description;
    private final Priority priority;

    public Issue(int effortManHours, String description, Priority priority) {
        this.effortManHours = effortManHours;
        this.description = description;
        this.priority = priority;
    }

    public String description() {
        return description;
    }

    public Integer effortManHours() {
        return effortManHours;
    }

    public Priority priority() {
        return priority;
    }
}
