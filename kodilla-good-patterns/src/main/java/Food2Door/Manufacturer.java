package Food2Door;

import java.time.LocalDate;

public class Manufacturer implements OrderRepository{

    private Order order;

    String companyName;
    String streetName;
    String streetNumber;
    String postCode;
    String city;
    String phoneNumber;

    public Manufacturer(String companyName, String streetName, String streetNumber, String postCode, String city, String phoneNumber) {
        this.companyName = companyName;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.postCode = postCode;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean processOrder(Client client, LocalDate localDate) {

        boolean isOrdered = order.order(client.getName(),LocalDate.of(2020,05,01));

        return false;
    }
}
