package Food2Door;

public class Client {

    String name;
    String streetName;
    String streetNumber;
    String postCode;
    String city;
    String phoneNumber;

    public Client(String name, String streetName, String streetNumber, String postCode, String city, String phoneNumber) {
        this.name = name;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.postCode = postCode;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getCity() {
        return city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
