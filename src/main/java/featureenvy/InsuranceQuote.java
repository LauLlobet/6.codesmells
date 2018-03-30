package featureenvy;

public class InsuranceQuote {
    final Motorist motorist;

    public InsuranceQuote(Motorist motorist) {
        this.motorist = motorist;
    }

    public double CalculateInsurancePremium(double insuranceValue) {
        RiskFactor riskFactor = motorist.calculateMotoristRisk();
        return riskFactor.calculateInsurancePremium(insuranceValue);
    }
}
