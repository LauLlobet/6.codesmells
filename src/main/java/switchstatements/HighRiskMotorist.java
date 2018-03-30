package switchstatements;

import java.time.LocalDate;

public class HighRiskMotorist extends  Motorist {
    HighRiskMotorist(Age age, int pointsOnLicense) {
        super(age, pointsOnLicense);
    }

    @Override
    public double calculateInsurancePremium(double insuranceValue) {
        return 0.06 * insuranceValue;
    }

    @Override
    public RiskFactor getRisk() {
        return RiskFactor.HIGH_RISK;
    }
}
