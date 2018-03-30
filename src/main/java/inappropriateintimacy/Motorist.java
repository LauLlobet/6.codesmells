package inappropriateintimacy;

import static inappropriateintimacy.RiskFactor.*;

public class Motorist {
    private final License license;
    private final String surname;
    private final String firstName;
    private final String title;

    public Motorist(License license, String surname, String firstName, String title) {
        license.setMotorist(this);
        this.license = license;
        this.surname = surname;
        this.firstName = firstName;
        this.title = title;
    }

    public RiskFactor riskFactor() {
        if (license.points() > 3) {
            return HIGH_RISK;
        }
        if (license.points() > 0) {
            return MODERATE_RISK;
        }
        return LOW_RISK;
    }

    public String title() {
        return title;
    }

    public String firstName() {
        return firstName;
    }

    public String surname() {
        return surname;
    }
}
