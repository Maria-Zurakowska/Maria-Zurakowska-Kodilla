package Food2Door;

import java.time.LocalDate;

public class Shop {

    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();

        Client client = new Client("ABS","Marszałkowska","45","01-345","Warszawa","224535678");
        Product product = new Product("fddf","dsfsf", 34);
        FoodOrderDto orderDto = new FoodOrderDto(client, product, LocalDate.now(),ManufacturerFactory.EXTRA_FOOD_SHOP);

        warehouse.processOrder(orderDto);
    }

}
