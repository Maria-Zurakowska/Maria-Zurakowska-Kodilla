package Food2Door;

public class ExtraFoodShop implements Manufacturer {
    @Override
    public boolean processOrder(FoodOrderDto orderDto) {
        System.out.println("still ongoing");
        return true;
    }
}
