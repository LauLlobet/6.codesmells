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

    public String summarize() {
        return "Description:'"+ description() + "' Effort:'" + effortManHours() + "' Priority:'" + priority() + "'";
    }

    private String description() {
        return description;
    }

    private Integer effortManHours() {
        return effortManHours;
    }

    private Priority priority() {
        return priority;
    }
}
