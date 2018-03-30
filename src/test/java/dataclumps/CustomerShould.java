package dataclumps;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CustomerShould {
    @Test
    public void
    customer_address_summary_includes_house_street_city_post_code_and_country() {
        Customer customer = new Customer("Dr", "Joseph", "Bloggs", "43", "Rankin Road", "London", "SW23 9YY", "United Kingdom");

        assertThat(customer.addressSummary(), is("43, Rankin Road, London, SW23 9YY, United Kingdom"));
    }
}
