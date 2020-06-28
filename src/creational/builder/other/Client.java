package creational.builder.other;

public class Client {
    public static void main(String[] args) {
        Product product = new Product.Builder()
                .setPartA("partA")
                .setPartB("partB")
                .setPartC("partC").build();
    }
}
