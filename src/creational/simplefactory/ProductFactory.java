package creational.simplefactory;

public class ProductFactory {
    public static Product createProduct(String productName) {
        if ("A".equals(productName)) {
            return new ProductA();
        } else if("B".equals(productName)) {
            return new ProductB();
        } else {
            return null;
        }
    }
}
