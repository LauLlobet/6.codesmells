package switchstatements;

import java.time.LocalDate;

public class LowRiskMotorist extends  Motorist{
    public LowRiskMotorist(Age age, int pointsOnLicense) {
        super(age, pointsOnLicense);
    }

    @Override
    public double calculateInsurancePremium(double insuranceValue) throws Exception {
        return 0.02 * insuranceValue;
    }
}
