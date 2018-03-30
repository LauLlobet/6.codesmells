package dataclumps;

public class Address {
    private final String house;
    private final String street;
    private final String city;
    private final String postCode;
    private final String country;

    public Address(String house, String street, String city, String postCode, String country) {
        this.house = house;
        this.street = street;
        this.city = city;
        this.postCode = postCode;
        this.country = country;
    }

    public String addressSumary() {
        return house + ", " + street + ", " + city + ", " + postCode + ", " + country;
    }
}
