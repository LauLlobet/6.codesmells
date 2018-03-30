package switchstatements;

public class LowRiskMotorist extends  Motorist {
    LowRiskMotorist(Age age, int pointsOnLicense) {
        super(age, pointsOnLicense);
    }

    @Override
    public double calculateInsurancePremium(double insuranceValue) {
        return 0.02 * insuranceValue;
    }

    @Override
    public RiskFactor getRisk() {
        return RiskFactor.LOW_RISK;
    }
}
