package creational.builder.tradition;

public class ConcreteBuilder2 extends Builder {
    private Product product;

    public ConcreteBuilder2() {
        product = new Product();
    }

    @Override
    void buildPartA() {
        product.setPartA("partA2");
    }

    @Override
    void buildPartB() {
        product.setPartA("partB2");
    }

    @Override
    void buildPartC() {
        product.setPartA("partC2");
    }

    @Override
    Product getResult() {
        return product;
    }
}
