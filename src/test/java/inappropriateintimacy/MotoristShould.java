package inappropriateintimacy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MotoristShould {
    @Test
    public void
    motorist_with_more_than_three_points_on_license_is_high_risk() {
        RiskFactor riskFactor = createMotoristWithPointsOnLicense(4).riskFactor();

        assertThat(riskFactor, is(RiskFactor.HIGH_RISK));
    }

    @Test
    public void
    motorist_with_no_points_on_license_is_low_risk() {
        RiskFactor riskFactor = createMotoristWithPointsOnLicense(0).riskFactor();

        assertThat(riskFactor, is(RiskFactor.LOW_RISK));

    }
    
    @Test
    public void
    motorist_with_one_to_three_points_on_license_is_moderate_risk() {
        RiskFactor riskFactor = createMotoristWithPointsOnLicense(1).riskFactor();

        assertThat(riskFactor, is(RiskFactor.MODERATE_RISK));
    }

    private Motorist createMotoristWithPointsOnLicense(int points) {
        License license = new License();
        license.addPoints(points);

        return new Motorist(license, "", "", "");
    }
}
