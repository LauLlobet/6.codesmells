package messagechains;

public class Address {
    private final Country country;

    public Address(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public boolean isInEurope() {
        return country.isInEurope();
    }
}
