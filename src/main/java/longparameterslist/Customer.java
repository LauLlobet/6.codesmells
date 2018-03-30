package longparameterslist;

public class Customer {
    public String firstName;
    public String lastName;
    public String title;
    public Address address;

    public String summary() {
        return buildCustomerSummary();
    }

    private String buildCustomerSummary() {
        return title + " " + firstName + " " + lastName + ", " + address.city + ", "
                + address.postcode + ", " + address.country;
    }
}
