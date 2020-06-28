package creational.builder.tradition;

public abstract class Builder {

    abstract void buildPartA();
    abstract void buildPartB();
    abstract void buildPartC();

    abstract Product getResult();
}
