package creational.abstractfactory;

public class Client {
    public static void main(String[] args) {
        ProductFactory productFactory1 = new ProductFactory1();
        ProductA productA1 = productFactory1.createProductA();
        ProductB productB1 = productFactory1.createProductB();

        ProductFactory productFactory2 = new ProductFactory2();
        ProductA productA2 = productFactory2.createProductA();
        ProductB productB2 = productFactory2.createProductB();

    }
}
