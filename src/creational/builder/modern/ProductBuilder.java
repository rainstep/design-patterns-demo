package creational.builder.modern;

public class ProductBuilder {
    private String partA;
    private String partB;
    private String partC;

    public ProductBuilder setPartA(String partA) {
        this.partA = partA;
        return this;
    }

    public ProductBuilder setPartB(String partB) {
        this.partB = partB;
        return this;
    }

    public ProductBuilder setPartC(String partC) {
        this.partC = partC;
        return this;
    }

    public Product build() {
        Product product = new Product();
        product.setPartA(this.partA);
        product.setPartB(this.partB);
        product.setPartC(this.partC);
        return product;
    }


}
