package copyandpasteinheritance;


public class SettlementAccount extends LoyaltyAccount {
    private float owing;
    public void borrow(float amount)
    {
        owing += amount;
    }
    public void settle()
    {
        balance -= owing;
    }
}
