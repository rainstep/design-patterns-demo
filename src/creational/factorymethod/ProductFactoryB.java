package creational.factorymethod;

public class ProductFactoryB extends ProductFactory {
    @Override
    ProductB createProduct() {
        return new ProductB();
    }
}
