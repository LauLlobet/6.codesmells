package inappropriateintimacy;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LicenseShould {
    @Test
    public void
    include_license_holder_full_name_and_points() {
        License license = new License();
        license.addPoints(3);
        Motorist motorist = new Motorist(license, "Gorman", "Jason", "Mr");

        assertThat(license.summary(), is("Mr Jason Gorman, 3 points"));
    }
}
