package inappropriateintimacy;

public class License {
    private int points;
    private Motorist motorist;

    public void addPoints(int points) {
        this.points += points;
    }

    public String summary() {
        return motorist.title() + " " + motorist.firstName() + " " + motorist.surname() + ", " + points + " points";
    }

    public void setMotorist(Motorist motorist) {
        this.motorist = motorist;
    }

    public int points() {
        return points;
    }
}
