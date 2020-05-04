package Food2Door;

public class GlutenFreeShop implements Manufacturer {
    @Override
    public boolean processOrder(FoodOrderDto orderDto) {
        System.out.println("ongoing");
        return true;
    }
}
