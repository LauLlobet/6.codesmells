package inappropriateintimacy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LicenseShould {
    @Test
    public void
    license_with_more_than_three_points_on_license_is_high_risk() {
        RiskFactor riskFactor = createLicenseWitNPoints(4).riskFactor();

        assertThat(riskFactor, is(RiskFactor.HIGH_RISK));
    }

    @Test
    public void
    license_with_no_points_on_license_is_low_risk() {
        RiskFactor riskFactor = createLicenseWitNPoints(0).riskFactor();

        assertThat(riskFactor, is(RiskFactor.LOW_RISK));

    }
    
    @Test
    public void
    license_with_one_to_three_points_on_license_is_moderate_risk() {
        RiskFactor riskFactor = createLicenseWitNPoints(1).riskFactor();

        assertThat(riskFactor, is(RiskFactor.MODERATE_RISK));
    }

    private License createLicenseWitNPoints(int points) {
        License license = new License();
        license.addPoints(points);

        return license;
    }
}
