package Food2Door;

import java.util.HashSet;

public class Shop {

    public static void main(String[] args) {



    Manufacturer manufacturer1 = new Manufacturer("ExtraFoodShop", "Marszałkowska", "15", "01-456", "Warszawa", "229562384");
    Manufacturer manufacturer2 = new Manufacturer("HealthyShop", "Obozowa", "22", "01-345", "Warszawa", "224562354");
    Manufacturer manufacturer3 = new Manufacturer("GlutenFreeShop", "Chmielna", "48", "01-234", "Warszawa", "224348112");

    HashSet<Manufacturer> manufacturersSet = new HashSet<Manufacturer>();
    manufacturersSet.add(manufacturer1);
    manufacturersSet.add(manufacturer2);
    manufacturersSet.add(manufacturer3);



}
}
