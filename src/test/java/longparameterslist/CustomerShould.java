package longparameterslist;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CustomerShould {
    @Test
    public void
    customer_summary_includes_full_name_with_title_and_city_post_code_and_country() {
        Customer customer = new Customer();
        customer.firstName = "Jason";
        customer.lastName = "Gorman";
        customer.title = "Mr";

        Address address = new Address();
        address.city = "London";
        address.postcode = "SW23 9YY";
        address.country = "United Kingdom";
        customer.address = address;

        assertThat(customer.summary(), is("Mr Jason Gorman, London, SW23 9YY, United Kingdom"));
    }
}
