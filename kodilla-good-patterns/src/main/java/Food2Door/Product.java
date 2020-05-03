package Food2Door;

public class Product {

    private String productName;
    private String productCategory;
    private int numberOfProducts;

    public Product(String productName, String productCategory, int numberOfProducts) {
        this.productName = productName;
        this.productCategory = productCategory;
        this.numberOfProducts = numberOfProducts;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }
}
