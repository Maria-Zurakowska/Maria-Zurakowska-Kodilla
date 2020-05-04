package Food2Door;

import java.time.LocalDate;

public class FoodOrderDto {
    private Client client;
    private Product product;
    private LocalDate ordered;
    private String manufacturer;

    public FoodOrderDto(Client client, Product product, LocalDate ordered, String manufacturer) {
        this.client = client;
        this.product = product;
        this.ordered = ordered;
        this.manufacturer = manufacturer;
    }

    public Client getClient() {
        return client;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDate getOrdered() {
        return ordered;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
