package switchstatements;

public class ModerateRiskMotorist extends Motorist {
    public ModerateRiskMotorist(Age age, int pointsOnLicense) {
        super(age, pointsOnLicense);
    }

    @Override
    public double calculateInsurancePremium(double insuranceValue) throws Exception {
        return 0.04 * insuranceValue;
    }

    @Override
    public RiskFactor getRisk() {
        return RiskFactor.MODERATE_RISK;
    }
}
