package inappropriateintimacy;

import static inappropriateintimacy.RiskFactor.*;

public class License {
    private int points;

    public void addPoints(int points) {
        this.points += points;
    }

    public int points() {
        return points;
    }

    public RiskFactor riskFactor() {
        if (points() > 3) {
            return HIGH_RISK;
        }
        if (points() > 0) {
            return MODERATE_RISK;
        }
        return LOW_RISK;
    }
}
