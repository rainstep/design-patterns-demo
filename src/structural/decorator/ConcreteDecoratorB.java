package structural.decorator;

public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    void operation() {
        super.operation();
        System.out.println("添加装饰B");
    }
}
