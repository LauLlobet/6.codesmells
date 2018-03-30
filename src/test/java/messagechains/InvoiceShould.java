package messagechains;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class InvoiceShould {
    @Test
    public void
    shipping_should_be_added_if_address_is_not_in_europe() {
        Address address = new Address(new Country(false));
        Customer customer = new Customer(address);
        Invoice invoice = new Invoice(customer);
        invoice.addItem(new InvoiceItem("Product X", 1, 100d));

        assertThat(invoice.totalPrice(), is(100d + Invoice.SHIPPING_COST_OUTSIDE_EU));
    }
}
