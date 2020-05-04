package Food2Door;

public class HealthyShop implements Manufacturer {
    @Override
    public boolean processOrder(FoodOrderDto orderDto) {
        System.out.println("The order has been processed");
        return true;
    }
}
