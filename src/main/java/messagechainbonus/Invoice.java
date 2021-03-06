package messagechainbonus;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    public static double SHIPPING_COST_OUTSIDE_EU = 10d;
    private final Customer customer;
    private List<InvoiceItem> invoiceItems = new ArrayList<>();

    Invoice(Customer customer) {
        this.customer = customer;
    }

    public void addItem(InvoiceItem invoiceItem) {
        invoiceItems.add(invoiceItem);
    }

    public double totalPrice() {
        double invoiceTotal = 0;

        for (InvoiceItem invoiceItem: invoiceItems) {
            invoiceTotal += invoiceItem.subtotal();
        }

        Country country = customer.getCountry();

        if (!country.isInEurope()) {
            invoiceTotal += SHIPPING_COST_OUTSIDE_EU;
        }

        return invoiceTotal;
    }
}
