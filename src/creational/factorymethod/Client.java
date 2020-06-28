package creational.factorymethod;

public class Client {
    public static void main(String[] args) {
        ProductFactoryA factoryA = new ProductFactoryA();
        ProductA productA = factoryA.createProduct();

        ProductFactoryB factoryB = new ProductFactoryB();
        ProductB productB = factoryB.createProduct();
    }
}
