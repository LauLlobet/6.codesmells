package switchstatements;

public class InsuranceQuote {
    private final Motorist motorist;

    InsuranceQuote(Motorist motorist) {
        this.motorist = motorist;
    }

    public double CalculateInsurancePremium(double insuranceValue) throws Exception {
        return motorist.calculateInsurancePremium(insuranceValue);
    }
}
