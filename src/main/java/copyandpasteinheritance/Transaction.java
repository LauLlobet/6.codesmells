package copyandpasteinheritance;

public class Transaction {
    private boolean isDebit;
    private float amount;

    Transaction(boolean isDebit, float amount) {
        this.isDebit = isDebit;
        this.amount = amount;
    }
}
