package switchstatements;

import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class InsuranceQuotationShould {
    @Test
    public void
    any_motorist_under_twenty_five_is_high_risk() {
        assertThat(calculateMotoristRisk("1995-01-01", 0), is(RiskFactor.HIGH_RISK));
    }

    @Test
    public void
    high_risk_motorists_pay_premium_of_six_percent_of_insurance_value() throws Exception {
        InsuranceQuote quote = buildInsuranceQuoteForMotorist("1990-01-01", 5);

        assertThat(quote.CalculateInsurancePremium(10000d), is(600d));
    }

    @Test
    public void
    low_risk_motorists_pay_premium_of_two_percent_of_insurance_value() throws Exception {
        InsuranceQuote quote = buildInsuranceQuoteForMotorist("1960-01-01", 0);

        assertThat(quote.CalculateInsurancePremium(10000d), is(200d));
    }

    @Test
    public void
    moderate_risk_motorists_pay_premium_of_four_percent_of_insurance_value() throws Exception {
        InsuranceQuote quote = buildInsuranceQuoteForMotorist("1960-01-01", 1);

        assertThat(quote.CalculateInsurancePremium(10000d), is(400d));
    }

    @Test
    public void
    motorist_with_more_than_three_points_on_license_over_twenty_five_presents_high_risk() {
        assertThat(calculateMotoristRisk("1970-01-01", 4), is(RiskFactor.HIGH_RISK));
    }

    @Test
    public void
    motorist_with_no_points_on_license_and_over_twenty_five_presents_low_risk() {
        assertThat(calculateMotoristRisk("1970-01-01", 0), is(RiskFactor.LOW_RISK));
    }

    @Test
    public void
    motorist_with_one_to_three_points_on_license_and_over_twenty_five_presents_moderate_risk() {
        assertThat(calculateMotoristRisk("1970-01-01", 3), is(RiskFactor.MODERATE_RISK));
    }

    private RiskFactor calculateMotoristRisk(String dateOfBirth, int pointsOnLicense) {
        return MotoristFactory.createMotorist(pointsOnLicense,parseDate(dateOfBirth)).getRisk();
    }

    private InsuranceQuote buildInsuranceQuoteForMotorist(String dateOfBirth, int pointsOnLicense) {
        return new InsuranceQuote(MotoristFactory.createMotorist( pointsOnLicense,parseDate(dateOfBirth)));
    }

    private LocalDate parseDate(String dateOfBirth) {
        return LocalDate.parse(dateOfBirth);
    }
}
