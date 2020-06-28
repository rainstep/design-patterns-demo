package creational.builder.tradition;

public class Client {
    public static void main(String[] args) {
        ConcreteBuilder1 builder1 = new ConcreteBuilder1();
        Director director = new Director(builder1);
        Product product = director.construct();
    }
}
