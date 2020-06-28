package creational.abstractfactory;

public class ProductFactory1 extends ProductFactory {
    @Override
    ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    ProductB createProductB() {
        return new ProductB1();
    }
}
