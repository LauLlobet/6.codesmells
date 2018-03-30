package switchstatements;

import static switchstatements.RiskFactor.*;

public class InsuranceQuote {
    private final Motorist motorist;

    public InsuranceQuote(Motorist motorist) {
        this.motorist = motorist;
    }

    public double CalculateInsurancePremium(double insuranceValue) throws Exception {
        return motorist.calculateInsurancePremium(insuranceValue);
    }
}
