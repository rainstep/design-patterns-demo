package creational.abstractfactory;


public class ProductFactory2 extends ProductFactory {
    @Override
    ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    ProductB createProductB() {
        return new ProductB2();
    }
}
