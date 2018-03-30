package dataclumps;

public class Customer {
    private final String title;
    private final String firstName;
    private final String lastName;
    private final String house;
    private final String street;
    private final String city;
    private final String postCode;
    private final String country;

    public Customer(String title, String firstName, String lastName, String house, String street, String city, String postCode, String country) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.house = house;
        this.street = street;
        this.city = city;
        this.postCode = postCode;
        this.country = country;
    }

    public String addressSummary () {
        return house + ", " + street + ", " + city + ", " + postCode + ", " + country;
    }
}
