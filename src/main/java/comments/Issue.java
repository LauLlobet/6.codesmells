package comments;

public class Issue {
    private float effortManHours;
    private String description;

    public Issue(float effortManHours, String description) {
        this.effortManHours = effortManHours;
        this.description = description;
    }

    public float getEffortManHours() {
        return effortManHours;
    }

    public String getDescription() {
        return description;
    }

    public void setEffortManHours(float effortManHours) {
        this.effortManHours = effortManHours;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
