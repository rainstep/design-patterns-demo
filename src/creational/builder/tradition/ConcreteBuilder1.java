package creational.builder.tradition;

public class ConcreteBuilder1 extends Builder {
    private Product product;

    public ConcreteBuilder1() {
        product = new Product();
    }

    @Override
    void buildPartA() {
        product.setPartA("partA1");
    }

    @Override
    void buildPartB() {
        product.setPartA("partB1");
    }

    @Override
    void buildPartC() {
        product.setPartA("partC1");
    }

    @Override
    Product getResult() {
        return product;
    }
}
