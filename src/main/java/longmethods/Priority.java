package longmethods;

public enum Priority {
    HIGH, MEDIUM, LOW, CRITICAL;

    public static Priority getPriorityFromEffort(float effortManHours) {
        if (effortManHours > 1000 || effortManHours <= 0)
        {
            throw new IllegalArgumentException("Cannot register tech debt where effort is bigger than 1000 man hours to fix");
        }
        if (effortManHours > 500)
        {
            return Priority.CRITICAL;
        }
        if (effortManHours > 250)
        {
            return Priority.HIGH;
        }
        if (effortManHours > 100)
        {
            return Priority.MEDIUM;
        }
        return Priority.LOW;
    }
}
