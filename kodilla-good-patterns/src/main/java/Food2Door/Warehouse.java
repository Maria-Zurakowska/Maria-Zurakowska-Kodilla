package Food2Door;

public class Warehouse {

    public void processOrder(FoodOrderDto orderDto) {
        Manufacturer manufacturer = ManufacturerFactory.get(orderDto.getManufacturer());
        manufacturer.processOrder(orderDto);
    }
}
