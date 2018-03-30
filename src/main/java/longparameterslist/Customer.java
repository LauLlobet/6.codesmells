package longparameterslist;

public class Customer {
    public String firstName;
    public String lastName;
    public String title;
    public Address address;

    public String summary() {
        return buildCustomerSummary(
                firstName,
                lastName,
                title,
                this.address.city,
                this.address.postcode,
                this.address.country
        );
    }

    private String buildCustomerSummary(String customerFirstName, String customerLastName, String customerTitle, String customerCity, String customerPostCode, String customerCountry) {
        return customerTitle + " " + customerFirstName + " " + customerLastName + ", " + customerCity + ", "
                + customerPostCode + ", " + customerCountry;
    }
}
