package creational.builder.modern;

public class Client {
    public static void main(String[] args) {
        Product product = new ProductBuilder()
                .setPartA("partA")
                .setPartB("partB")
                .setPartC("partC").build();
    }
}
