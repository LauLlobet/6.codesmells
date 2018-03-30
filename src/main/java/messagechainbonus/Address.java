package messagechainbonus;

public class Address {
    private final Country country;

    public Address(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }
}
