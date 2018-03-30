package featureenvy;

public enum RiskFactor {
    MODERATE_RISK, LOW_RISK, HIGH_RISK;


    //I don't like using switch, i'd use inheritance for this method
    public double calculateInsurancePremium(double insuranceValue) {
        switch (this)
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
