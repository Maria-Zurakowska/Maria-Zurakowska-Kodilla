package Food2Door;

public class ManufacturerFactory {

    public static final String EXTRA_FOOD_SHOP = "ExtraFoodShop";
    public static final String GLUTEN_FREE_SHOP = "GlutenFreeShop";
    public static final String HEALTHY_SHOP = "HealthyShop";

    public static Manufacturer get(String manufacturer) {

        switch (manufacturer){
            case EXTRA_FOOD_SHOP: return new ExtraFoodShop();
            case GLUTEN_FREE_SHOP: return new GlutenFreeShop();
            case HEALTHY_SHOP: return new HealthyShop();
            default: return null;
        }
    }
}
