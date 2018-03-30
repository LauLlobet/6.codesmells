package featureenvy;

import static featureenvy.RiskFactor.HIGH_RISK;
import static featureenvy.RiskFactor.LOW_RISK;
import static featureenvy.RiskFactor.MODERATE_RISK;

public class InsuranceQuote {
    private final Motorist motorist;

    public InsuranceQuote(Motorist motorist) {
        this.motorist = motorist;
    }

    public RiskFactor calculateMotoristRisk() {
        if (motorist.pointsOnLicense() > 3 || motorist.age() < 25)
        {
            return HIGH_RISK;
        }

        if (motorist.pointsOnLicense() > 0)
        {
            return MODERATE_RISK;
        }

        return LOW_RISK;
    }

    public double CalculateInsurancePremium(double insuranceValue) {
        RiskFactor riskFactor = calculateMotoristRisk();

        switch (riskFactor)
        {
            case LOW_RISK:
                return insuranceValue * 0.02;
            case MODERATE_RISK:
                return insuranceValue * 0.04;
            default:
                return insuranceValue * 0.06;
        }
    }
}
