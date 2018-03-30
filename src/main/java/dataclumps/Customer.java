package dataclumps;

public class Customer {
    private final String title;
    private final String firstName;
    private final String lastName;
    private final Address address;


    public Customer(String title, String firstName, String lastName, String house, String street, String city, String postCode, String country) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = new Address(house,street,city,postCode,country);
    }

    public String addressSummary ()
    {
        return address.addressSumary();
    }
}
