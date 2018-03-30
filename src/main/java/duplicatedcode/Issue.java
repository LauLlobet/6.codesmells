package duplicatedcode;

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
}
