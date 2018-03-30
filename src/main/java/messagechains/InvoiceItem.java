package messagechains;

public class InvoiceItem {
    private final String itemName;
    private final int quantity;
    private final double unitPrice;

    InvoiceItem(String itemName, int quantity, double unitPrice) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public double subtotal() {
        return unitPrice * quantity;
    }
}
