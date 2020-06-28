package creational.factorymethod;

public class ProductFactoryA extends ProductFactory {
    @Override
    ProductA createProduct() {
        return new ProductA();
    }
}
