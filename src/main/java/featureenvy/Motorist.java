package featureenvy;

import java.time.LocalDate;

import static featureenvy.RiskFactor.HIGH_RISK;
import static featureenvy.RiskFactor.LOW_RISK;
import static featureenvy.RiskFactor.MODERATE_RISK;

public class Motorist {
    private final LocalDate dateOfBirth;
    private final int pointsOnLicense;

    public Motorist(LocalDate dateOfBirth, int pointsOnLicense) {
        this.dateOfBirth = dateOfBirth;
        this.pointsOnLicense = pointsOnLicense;
    }

    private int pointsOnLicense() {
        return pointsOnLicense;
    }

    private int age() {
        LocalDate now = LocalDate.now();
        int ageYr = now.getYear() - dateOfBirth.getYear();
        int ageMo = now.getMonthValue() - dateOfBirth.getMonthValue();

        return adjustYearsDownIfNegativeMonthDifference(ageYr, ageMo);
    }

    private int adjustYearsDownIfNegativeMonthDifference(int ageYr, int ageMo)
    {
        if (ageMo < 0) {
            ageYr--;
        }

        return ageYr;
    }

    public RiskFactor calculateMotoristRisk() {
        if (pointsOnLicense() > 3 || age() < 25)
        {
            return HIGH_RISK;
        }

        if (pointsOnLicense() > 0)
        {
            return MODERATE_RISK;
        }

        return LOW_RISK;
    }
}
