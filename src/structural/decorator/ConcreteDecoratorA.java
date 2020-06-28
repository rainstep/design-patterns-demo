package structural.decorator;

public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    void operation() {
        super.operation();
        System.out.println("添加装饰A");
    }

}
